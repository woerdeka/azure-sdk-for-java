// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.arizeaiobservabilityeval.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.arizeaiobservabilityeval.ArizeAIObservabilityEvalManager;
import com.azure.resourcemanager.arizeaiobservabilityeval.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.arizeaiobservabilityeval.models.OrganizationResource;
import com.azure.resourcemanager.arizeaiobservabilityeval.models.SingleSignOnStates;
import com.azure.resourcemanager.arizeaiobservabilityeval.models.SingleSignOnType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OrganizationsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"marketplace\":{\"subscriptionId\":\"jumasx\",\"subscriptionStatus\":\"Subscribed\",\"offerDetails\":{\"publisherId\":\"pqyegualhbxxh\",\"offerId\":\"jj\",\"planId\":\"zvdudgwdslfhotwm\",\"planName\":\"npwlbjnpg\",\"termUnit\":\"ftadehxnltyfs\",\"termId\":\"pusuesn\"}},\"user\":{\"firstName\":\"dejbavo\",\"lastName\":\"zdmohctbqvu\",\"emailAddress\":\"xdn\",\"upn\":\"vo\",\"phoneNumber\":\"ujjugwdkcglh\"},\"provisioningState\":\"Canceled\",\"partnerProperties\":{\"description\":\"jdyggdtji\"},\"singleSignOnProperties\":{\"type\":\"Saml\",\"state\":\"Disable\",\"enterpriseAppId\":\"fqweykhmene\",\"url\":\"yexfwh\",\"aadDomains\":[\"i\",\"vyvdcs\",\"tynnaamdectehfi\",\"scjeypv\"]}},\"identity\":{\"principalId\":\"rkgqhcjrefo\",\"tenantId\":\"mkqsleyyv\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"pngjcrcczsqpjhvm\":{\"clientId\":\"k\",\"principalId\":\"t\"},\"pfhyhl\":{\"clientId\":\"jvnysounqe\",\"principalId\":\"noae\"},\"thfuiuaodsfcpkvx\":{\"clientId\":\"pmopjmc\",\"principalId\":\"tuo\"}}},\"location\":\"puozmyzydag\",\"tags\":{\"dxwzywqsmbsurexi\":\"xbezyiuokktwh\",\"yocf\":\"o\",\"uxh\":\"fksymddystki\"},\"id\":\"yudxorrqnbp\",\"name\":\"czvyifq\",\"type\":\"vkd\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ArizeAIObservabilityEvalManager manager = ArizeAIObservabilityEvalManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        OrganizationResource response = manager.organizations()
            .getByResourceGroupWithResponse("eyy", "enjbdlwtgrhp", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("puozmyzydag", response.location());
        Assertions.assertEquals("xbezyiuokktwh", response.tags().get("dxwzywqsmbsurexi"));
        Assertions.assertEquals("jumasx", response.properties().marketplace().subscriptionId());
        Assertions.assertEquals("pqyegualhbxxh", response.properties().marketplace().offerDetails().publisherId());
        Assertions.assertEquals("jj", response.properties().marketplace().offerDetails().offerId());
        Assertions.assertEquals("zvdudgwdslfhotwm", response.properties().marketplace().offerDetails().planId());
        Assertions.assertEquals("npwlbjnpg", response.properties().marketplace().offerDetails().planName());
        Assertions.assertEquals("ftadehxnltyfs", response.properties().marketplace().offerDetails().termUnit());
        Assertions.assertEquals("pusuesn", response.properties().marketplace().offerDetails().termId());
        Assertions.assertEquals("dejbavo", response.properties().user().firstName());
        Assertions.assertEquals("zdmohctbqvu", response.properties().user().lastName());
        Assertions.assertEquals("xdn", response.properties().user().emailAddress());
        Assertions.assertEquals("vo", response.properties().user().upn());
        Assertions.assertEquals("ujjugwdkcglh", response.properties().user().phoneNumber());
        Assertions.assertEquals("jdyggdtji", response.properties().partnerProperties().description());
        Assertions.assertEquals(SingleSignOnType.SAML, response.properties().singleSignOnProperties().type());
        Assertions.assertEquals(SingleSignOnStates.DISABLE, response.properties().singleSignOnProperties().state());
        Assertions.assertEquals("fqweykhmene", response.properties().singleSignOnProperties().enterpriseAppId());
        Assertions.assertEquals("yexfwh", response.properties().singleSignOnProperties().url());
        Assertions.assertEquals("i", response.properties().singleSignOnProperties().aadDomains().get(0));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.identity().type());
    }
}
