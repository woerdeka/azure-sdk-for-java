// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PrefixListResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrefixListLocalRulestacksCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"description\":\"dmskxknpdgzigjsu\",\"prefixList\":[\"whgsaodkww\",\"bafo\",\"to\"],\"etag\":\"haquvwsxbgnvk\",\"auditComment\":\"vqchoadhrs\",\"provisioningState\":\"Succeeded\"},\"id\":\"vspabdsrgfajgl\",\"name\":\"rsubklrxhjnl\",\"type\":\"cetjdvq\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PaloAltoNetworksNgfwManager manager = PaloAltoNetworksNgfwManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrefixListResource response = manager.prefixListLocalRulestacks()
            .define("ilrixysf")
            .withExistingLocalRulestack("phgerhsmvgoh", "wzm")
            .withPrefixList(Arrays.asList("ympmlqoin", "zduewihapfjii"))
            .withDescription("msqywwwmhkruwae")
            .withEtag("jdiq")
            .withAuditComment("iej")
            .create();

        Assertions.assertEquals("dmskxknpdgzigjsu", response.description());
        Assertions.assertEquals("whgsaodkww", response.prefixList().get(0));
        Assertions.assertEquals("haquvwsxbgnvk", response.etag());
        Assertions.assertEquals("vqchoadhrs", response.auditComment());
    }
}
