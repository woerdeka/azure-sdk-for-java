// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.resourcemanager.storagecache.models.ConflictResolutionMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ImportJobs CreateOrUpdate.
 */
public final class ImportJobsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/storagecache/resource-manager/Microsoft.StorageCache/stable/2024-03-01/examples/
     * importJobs_CreateOrUpdate.json
     */
    /**
     * Sample code: importJobs_CreateOrUpdate.
     * 
     * @param manager Entry point to StorageCacheManager.
     */
    public static void importJobsCreateOrUpdate(com.azure.resourcemanager.storagecache.StorageCacheManager manager) {
        manager.importJobs()
            .define("job1")
            .withRegion("eastus")
            .withExistingAmlFilesystem("scgroup", "fs1")
            .withTags(mapOf("Dept", "ContosoAds"))
            .withImportPrefixes(Arrays.asList("/"))
            .withConflictResolutionMode(ConflictResolutionMode.OVERWRITE_ALWAYS)
            .withMaximumErrors(0)
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
