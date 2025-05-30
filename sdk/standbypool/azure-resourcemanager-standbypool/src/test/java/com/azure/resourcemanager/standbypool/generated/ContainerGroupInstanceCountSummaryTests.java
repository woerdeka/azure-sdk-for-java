// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.standbypool.models.ContainerGroupInstanceCountSummary;
import com.azure.resourcemanager.standbypool.models.PoolContainerGroupState;
import org.junit.jupiter.api.Assertions;

public final class ContainerGroupInstanceCountSummaryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerGroupInstanceCountSummary model = BinaryData.fromString(
            "{\"zone\":6238145769223006535,\"instanceCountsByState\":[{\"state\":\"Creating\",\"count\":3208959223974394461},{\"state\":\"Deleting\",\"count\":8436976750184221107}]}")
            .toObject(ContainerGroupInstanceCountSummary.class);
        Assertions.assertEquals(6238145769223006535L, model.zone());
        Assertions.assertEquals(PoolContainerGroupState.CREATING, model.instanceCountsByState().get(0).state());
        Assertions.assertEquals(3208959223974394461L, model.instanceCountsByState().get(0).count());
    }
}
