// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.durabletask.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.durabletask.models.SchedulerPropertiesUpdate;
import com.azure.resourcemanager.durabletask.models.SchedulerSkuUpdate;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SchedulerPropertiesUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SchedulerPropertiesUpdate model = BinaryData.fromString(
            "{\"provisioningState\":\"Failed\",\"endpoint\":\"jkjlxofpdvhpfx\",\"ipAllowlist\":[\"ininmay\"],\"sku\":{\"name\":\"bbkpodep\",\"capacity\":92863061,\"redundancyState\":\"Zone\"}}")
            .toObject(SchedulerPropertiesUpdate.class);
        Assertions.assertEquals("ininmay", model.ipAllowlist().get(0));
        Assertions.assertEquals("bbkpodep", model.sku().name());
        Assertions.assertEquals(92863061, model.sku().capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SchedulerPropertiesUpdate model = new SchedulerPropertiesUpdate().withIpAllowlist(Arrays.asList("ininmay"))
            .withSku(new SchedulerSkuUpdate().withName("bbkpodep").withCapacity(92863061));
        model = BinaryData.fromObject(model).toObject(SchedulerPropertiesUpdate.class);
        Assertions.assertEquals("ininmay", model.ipAllowlist().get(0));
        Assertions.assertEquals("bbkpodep", model.sku().name());
        Assertions.assertEquals(92863061, model.sku().capacity());
    }
}
