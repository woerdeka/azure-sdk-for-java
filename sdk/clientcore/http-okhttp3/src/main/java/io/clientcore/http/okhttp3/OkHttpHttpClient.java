// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.http.okhttp3;

import io.clientcore.core.http.client.HttpClient;
import io.clientcore.core.http.models.HttpHeaderName;
import io.clientcore.core.http.models.HttpHeaders;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.HttpRequest;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.models.ServerSentEventListener;
import io.clientcore.core.instrumentation.logging.ClientLogger;
import io.clientcore.core.models.ServerSentResult;
import io.clientcore.core.models.binarydata.BinaryData;
import io.clientcore.core.models.binarydata.FileBinaryData;
import io.clientcore.core.models.binarydata.InputStreamBinaryData;
import io.clientcore.core.utils.ServerSentEventUtils;
import io.clientcore.http.okhttp3.implementation.OkHttpFileRequestBody;
import io.clientcore.http.okhttp3.implementation.OkHttpInputStreamRequestBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.io.IOException;

import static io.clientcore.core.http.models.HttpMethod.HEAD;
import static io.clientcore.core.utils.ServerSentEventUtils.attemptRetry;
import static io.clientcore.core.utils.ServerSentEventUtils.processTextEventStream;
import static io.clientcore.http.okhttp3.implementation.OkHttpToCoreHttpHeadersWrapper.fromOkHttpHeaders;

/**
 * HttpClient implementation for OkHttp.
 */
class OkHttpHttpClient implements HttpClient {
    private static final ClientLogger LOGGER = new ClientLogger(OkHttpHttpClient.class);
    private static final byte[] EMPTY_BODY = new byte[0];
    private static final RequestBody EMPTY_REQUEST_BODY = RequestBody.create(EMPTY_BODY);

    /**
     * Error message for when no {@link ServerSentEventListener} is attached to the {@link HttpRequest}.
     */
    private static final String NO_LISTENER_ERROR_MESSAGE
        = "No ServerSentEventListener attached to HttpRequest to handle the text/event-stream response";

    final OkHttpClient httpClient;

    OkHttpHttpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public Response<BinaryData> send(HttpRequest request) throws IOException {
        Request okHttpRequest = toOkHttpRequest(request);
        okhttp3.Response okHttpResponse = httpClient.newCall(okHttpRequest).execute();

        return toResponse(request, okHttpResponse);
    }

    /**
     * Converts the given core request to okhttp request.
     *
     * @param request the core request.
     *
     * @return The OkHttp request.
     */
    private okhttp3.Request toOkHttpRequest(HttpRequest request) {
        Request.Builder requestBuilder = new Request.Builder().url(request.getUri().toString());

        if (request.getHeaders() != null) {
            request.getHeaders().stream().forEach(hdr -> {
                // OkHttp allows for headers with multiple values, but it treats them as separate headers,
                // therefore, we must call rb.addHeader for each value, using the same key for all of them
                hdr.getValues().forEach(value -> requestBuilder.addHeader(hdr.getName().toString(), value));
            });
        }

        if (request.getHttpMethod() == HttpMethod.GET) {
            return requestBuilder.get().build();
        } else if (request.getHttpMethod() == HttpMethod.HEAD) {
            return requestBuilder.head().build();
        }

        RequestBody okHttpRequestBody = toOkHttpRequestBody(request.getBody(), request.getHeaders());

        return requestBuilder.method(request.getHttpMethod().toString(), okHttpRequestBody).build();
    }

    /**
     * Create a Mono of okhttp3.RequestBody from the given BinaryData.
     *
     * @param bodyContent The request body content
     * @param headers the headers associated with the original request
     *
     * @return The Mono emitting okhttp request
     */
    private RequestBody toOkHttpRequestBody(BinaryData bodyContent, HttpHeaders headers) {
        if (bodyContent == null || bodyContent == BinaryData.empty()) {
            return EMPTY_REQUEST_BODY;
        }

        String contentType = headers.getValue(HttpHeaderName.CONTENT_TYPE);
        MediaType mediaType = (contentType == null) ? null : MediaType.parse(contentType);

        if (bodyContent instanceof InputStreamBinaryData) {
            long effectiveContentLength = getRequestContentLength(bodyContent, headers);

            // The OkHttpInputStreamRequestBody doesn't read bytes until it's triggered by OkHttp dispatcher.
            return new OkHttpInputStreamRequestBody((InputStreamBinaryData) bodyContent, effectiveContentLength,
                mediaType);
        } else if (bodyContent instanceof FileBinaryData) {
            long effectiveContentLength = getRequestContentLength(bodyContent, headers);

            // The OkHttpFileRequestBody doesn't read bytes until it's triggered by OkHttp dispatcher.
            return new OkHttpFileRequestBody((FileBinaryData) bodyContent, effectiveContentLength, mediaType);
        } else {
            return RequestBody.create(bodyContent.toBytes(), mediaType);
        }
    }

    private static long getRequestContentLength(BinaryData content, HttpHeaders headers) {
        Long contentLength = content.getLength();

        if (contentLength == null) {
            String contentLengthHeaderValue = headers.getValue(HttpHeaderName.CONTENT_LENGTH);

            if (contentLengthHeaderValue != null) {
                contentLength = Long.parseLong(contentLengthHeaderValue);
            } else {
                // -1 means that content length is unknown.
                contentLength = -1L;
            }
        }

        return contentLength;
    }

    private Response<BinaryData> toResponse(HttpRequest request, okhttp3.Response response) throws IOException {
        ServerSentResult serverSentResult = null;
        HttpHeaders headers = fromOkHttpHeaders(response.headers());

        if (isTextEventStream(headers) && response.body() != null) {
            ServerSentEventListener listener = request.getServerSentEventListener();

            if (listener != null) {
                serverSentResult = processTextEventStream(response.body().byteStream(), listener);

                if (serverSentResult.getException() != null) {
                    // If an exception occurred while processing the text event stream, emit listener onError.
                    listener.onError(serverSentResult.getException());
                }

                // If an error occurred or we want to reconnect
                if (!Thread.currentThread().isInterrupted() && attemptRetry(serverSentResult, request)) {
                    return this.send(request);
                }
            } else {
                throw LOGGER.logThrowableAsError(new RuntimeException(NO_LISTENER_ERROR_MESSAGE));
            }
        }

        BinaryData body = null;
        BodyHandling bodyHandling = getBodyHandling(request, headers);

        switch (bodyHandling) {
            case IGNORE:
                if (response.body() != null) {
                    response.body().close();
                }
                break;

            case STREAM:
                if (isTextEventStream(headers)) {
                    body = createBodyFromServerSentResult(serverSentResult);
                } else if (response.body() != null && response.body().contentLength() != 0) {
                    body = BinaryData.fromStream(response.body().byteStream());
                }
                break;

            case BUFFER:
                // Deserialization will occur at a later point in HttpResponseBodyDecoder.
                if (isTextEventStream(headers)) {
                    body = createBodyFromServerSentResult(serverSentResult);
                } else {
                    body = createBodyFromResponseBody(response.body());
                }
                break;

            default:
                body = createBodyFromResponseBody(response.body());
                break;
        }

        return new Response<>(request, response.code(), headers, body == null ? BinaryData.empty() : body);
    }

    private BinaryData createBodyFromServerSentResult(ServerSentResult serverSentResult) {
        String bodyContent = (serverSentResult != null && serverSentResult.getData() != null)
            ? String.join("\n", serverSentResult.getData())
            : "";
        return BinaryData.fromString(bodyContent);
    }

    private BinaryData createBodyFromResponseBody(ResponseBody responseBody) throws IOException {
        if (responseBody != null && responseBody.contentLength() != 0) {
            return BinaryData.fromBytes(responseBody.bytes());
        }
        return null;
    }

    private BodyHandling getBodyHandling(HttpRequest request, HttpHeaders responseHeaders) {
        String contentType = responseHeaders.getValue(HttpHeaderName.CONTENT_TYPE);

        if (request.getHttpMethod() == HEAD) {
            return BodyHandling.IGNORE;
        } else if ("application/octet-stream".equalsIgnoreCase(contentType)) {
            return BodyHandling.STREAM;
        } else {
            return BodyHandling.BUFFER;
        }
    }

    private enum BodyHandling {
        IGNORE, STREAM, BUFFER
    }

    private static boolean isTextEventStream(HttpHeaders responseHeaders) {
        if (responseHeaders != null) {
            return ServerSentEventUtils
                .isTextEventStreamContentType(responseHeaders.getValue(HttpHeaderName.CONTENT_TYPE));
        }

        return false;
    }
}
