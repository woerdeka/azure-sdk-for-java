// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.peering.fluent.models.PeerAsnInner;

/**
 * An instance of this class provides access to all the operations defined in PeerAsnsClient.
 */
public interface PeerAsnsClient {
    /**
     * Gets the peer ASN with the specified name under the given subscription.
     * 
     * @param peerAsnName The peer ASN name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the peer ASN with the specified name under the given subscription along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PeerAsnInner> getWithResponse(String peerAsnName, Context context);

    /**
     * Gets the peer ASN with the specified name under the given subscription.
     * 
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the peer ASN with the specified name under the given subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PeerAsnInner get(String peerAsnName);

    /**
     * Creates a new peer ASN or updates an existing peer ASN with the specified name under the given subscription.
     * 
     * @param peerAsnName The peer ASN name.
     * @param peerAsn The peer ASN.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the essential information related to the peer's ASN along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PeerAsnInner> createOrUpdateWithResponse(String peerAsnName, PeerAsnInner peerAsn, Context context);

    /**
     * Creates a new peer ASN or updates an existing peer ASN with the specified name under the given subscription.
     * 
     * @param peerAsnName The peer ASN name.
     * @param peerAsn The peer ASN.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the essential information related to the peer's ASN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PeerAsnInner createOrUpdate(String peerAsnName, PeerAsnInner peerAsn);

    /**
     * Deletes an existing peer ASN with the specified name under the given subscription.
     * 
     * @param peerAsnName The peer ASN name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String peerAsnName, Context context);

    /**
     * Deletes an existing peer ASN with the specified name under the given subscription.
     * 
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String peerAsnName);

    /**
     * Lists all of the peer ASNs under the given subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peer ASNs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PeerAsnInner> list();

    /**
     * Lists all of the peer ASNs under the given subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peer ASNs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PeerAsnInner> list(Context context);
}
