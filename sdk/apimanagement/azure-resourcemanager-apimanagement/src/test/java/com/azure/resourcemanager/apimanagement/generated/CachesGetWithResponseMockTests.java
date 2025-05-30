// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.CacheContract;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CachesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"description\":\"rjxcon\",\"connectionString\":\"ick\",\"useFromLocation\":\"kithueoc\",\"resourceId\":\"vuqzgbjwvrudmp\"},\"id\":\"ewpmioleaja\",\"name\":\"esgyzwph\",\"type\":\"jkscecmbaajdfw\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ApiManagementManager manager = ApiManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CacheContract response = manager.caches()
            .getWithResponse("tv", "piqdqbvxqto", "pwbopvhcbt", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("rjxcon", response.description());
        Assertions.assertEquals("ick", response.connectionString());
        Assertions.assertEquals("kithueoc", response.useFromLocation());
        Assertions.assertEquals("vuqzgbjwvrudmp", response.resourceId());
    }
}
