// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.migration.assessment.fluent.AvsAssessmentOptionsOperationsClient;
import com.azure.resourcemanager.migration.assessment.fluent.models.AvsAssessmentOptionsInner;
import com.azure.resourcemanager.migration.assessment.models.AvsAssessmentOptions;
import com.azure.resourcemanager.migration.assessment.models.AvsAssessmentOptionsOperations;

public final class AvsAssessmentOptionsOperationsImpl implements AvsAssessmentOptionsOperations {
    private static final ClientLogger LOGGER = new ClientLogger(AvsAssessmentOptionsOperationsImpl.class);

    private final AvsAssessmentOptionsOperationsClient innerClient;

    private final com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager;

    public AvsAssessmentOptionsOperationsImpl(AvsAssessmentOptionsOperationsClient innerClient,
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AvsAssessmentOptions> listByAssessmentProject(String resourceGroupName, String projectName) {
        PagedIterable<AvsAssessmentOptionsInner> inner
            = this.serviceClient().listByAssessmentProject(resourceGroupName, projectName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AvsAssessmentOptionsImpl(inner1, this.manager()));
    }

    public PagedIterable<AvsAssessmentOptions> listByAssessmentProject(String resourceGroupName, String projectName,
        Context context) {
        PagedIterable<AvsAssessmentOptionsInner> inner
            = this.serviceClient().listByAssessmentProject(resourceGroupName, projectName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AvsAssessmentOptionsImpl(inner1, this.manager()));
    }

    public Response<AvsAssessmentOptions> getWithResponse(String resourceGroupName, String projectName,
        String avsAssessmentOptionsName, Context context) {
        Response<AvsAssessmentOptionsInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, projectName, avsAssessmentOptionsName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AvsAssessmentOptionsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AvsAssessmentOptions get(String resourceGroupName, String projectName, String avsAssessmentOptionsName) {
        AvsAssessmentOptionsInner inner
            = this.serviceClient().get(resourceGroupName, projectName, avsAssessmentOptionsName);
        if (inner != null) {
            return new AvsAssessmentOptionsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private AvsAssessmentOptionsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager() {
        return this.serviceManager;
    }
}
