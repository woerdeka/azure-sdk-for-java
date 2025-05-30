// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The SAP Sizing Recommendation request.
 */
@Fluent
public final class SapSizingRecommendationRequest implements JsonSerializable<SapSizingRecommendationRequest> {
    /*
     * The geo-location where the resource is to be created.
     */
    private String appLocation;

    /*
     * Defines the environment type - Production/Non Production.
     */
    private SapEnvironmentType environment;

    /*
     * Defines the SAP Product type.
     */
    private SapProductType sapProduct;

    /*
     * The deployment type. Eg: SingleServer/ThreeTier
     */
    private SapDeploymentType deploymentType;

    /*
     * The SAP Application Performance Standard measurement.
     */
    private long saps;

    /*
     * The database memory configuration.
     */
    private long dbMemory;

    /*
     * The database type.
     */
    private SapDatabaseType databaseType;

    /*
     * The DB scale method.
     */
    private SapDatabaseScaleMethod dbScaleMethod;

    /*
     * The high availability type.
     */
    private SapHighAvailabilityType highAvailabilityType;

    /**
     * Creates an instance of SapSizingRecommendationRequest class.
     */
    public SapSizingRecommendationRequest() {
    }

    /**
     * Get the appLocation property: The geo-location where the resource is to be created.
     * 
     * @return the appLocation value.
     */
    public String appLocation() {
        return this.appLocation;
    }

    /**
     * Set the appLocation property: The geo-location where the resource is to be created.
     * 
     * @param appLocation the appLocation value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withAppLocation(String appLocation) {
        this.appLocation = appLocation;
        return this;
    }

    /**
     * Get the environment property: Defines the environment type - Production/Non Production.
     * 
     * @return the environment value.
     */
    public SapEnvironmentType environment() {
        return this.environment;
    }

    /**
     * Set the environment property: Defines the environment type - Production/Non Production.
     * 
     * @param environment the environment value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withEnvironment(SapEnvironmentType environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get the sapProduct property: Defines the SAP Product type.
     * 
     * @return the sapProduct value.
     */
    public SapProductType sapProduct() {
        return this.sapProduct;
    }

    /**
     * Set the sapProduct property: Defines the SAP Product type.
     * 
     * @param sapProduct the sapProduct value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withSapProduct(SapProductType sapProduct) {
        this.sapProduct = sapProduct;
        return this;
    }

    /**
     * Get the deploymentType property: The deployment type. Eg: SingleServer/ThreeTier.
     * 
     * @return the deploymentType value.
     */
    public SapDeploymentType deploymentType() {
        return this.deploymentType;
    }

    /**
     * Set the deploymentType property: The deployment type. Eg: SingleServer/ThreeTier.
     * 
     * @param deploymentType the deploymentType value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withDeploymentType(SapDeploymentType deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * Get the saps property: The SAP Application Performance Standard measurement.
     * 
     * @return the saps value.
     */
    public long saps() {
        return this.saps;
    }

    /**
     * Set the saps property: The SAP Application Performance Standard measurement.
     * 
     * @param saps the saps value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withSaps(long saps) {
        this.saps = saps;
        return this;
    }

    /**
     * Get the dbMemory property: The database memory configuration.
     * 
     * @return the dbMemory value.
     */
    public long dbMemory() {
        return this.dbMemory;
    }

    /**
     * Set the dbMemory property: The database memory configuration.
     * 
     * @param dbMemory the dbMemory value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withDbMemory(long dbMemory) {
        this.dbMemory = dbMemory;
        return this;
    }

    /**
     * Get the databaseType property: The database type.
     * 
     * @return the databaseType value.
     */
    public SapDatabaseType databaseType() {
        return this.databaseType;
    }

    /**
     * Set the databaseType property: The database type.
     * 
     * @param databaseType the databaseType value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withDatabaseType(SapDatabaseType databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    /**
     * Get the dbScaleMethod property: The DB scale method.
     * 
     * @return the dbScaleMethod value.
     */
    public SapDatabaseScaleMethod dbScaleMethod() {
        return this.dbScaleMethod;
    }

    /**
     * Set the dbScaleMethod property: The DB scale method.
     * 
     * @param dbScaleMethod the dbScaleMethod value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withDbScaleMethod(SapDatabaseScaleMethod dbScaleMethod) {
        this.dbScaleMethod = dbScaleMethod;
        return this;
    }

    /**
     * Get the highAvailabilityType property: The high availability type.
     * 
     * @return the highAvailabilityType value.
     */
    public SapHighAvailabilityType highAvailabilityType() {
        return this.highAvailabilityType;
    }

    /**
     * Set the highAvailabilityType property: The high availability type.
     * 
     * @param highAvailabilityType the highAvailabilityType value to set.
     * @return the SapSizingRecommendationRequest object itself.
     */
    public SapSizingRecommendationRequest withHighAvailabilityType(SapHighAvailabilityType highAvailabilityType) {
        this.highAvailabilityType = highAvailabilityType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (appLocation() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property appLocation in model SapSizingRecommendationRequest"));
        }
        if (environment() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property environment in model SapSizingRecommendationRequest"));
        }
        if (sapProduct() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sapProduct in model SapSizingRecommendationRequest"));
        }
        if (deploymentType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property deploymentType in model SapSizingRecommendationRequest"));
        }
        if (databaseType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property databaseType in model SapSizingRecommendationRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapSizingRecommendationRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("appLocation", this.appLocation);
        jsonWriter.writeStringField("environment", this.environment == null ? null : this.environment.toString());
        jsonWriter.writeStringField("sapProduct", this.sapProduct == null ? null : this.sapProduct.toString());
        jsonWriter.writeStringField("deploymentType",
            this.deploymentType == null ? null : this.deploymentType.toString());
        jsonWriter.writeLongField("saps", this.saps);
        jsonWriter.writeLongField("dbMemory", this.dbMemory);
        jsonWriter.writeStringField("databaseType", this.databaseType == null ? null : this.databaseType.toString());
        jsonWriter.writeStringField("dbScaleMethod", this.dbScaleMethod == null ? null : this.dbScaleMethod.toString());
        jsonWriter.writeStringField("highAvailabilityType",
            this.highAvailabilityType == null ? null : this.highAvailabilityType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SapSizingRecommendationRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SapSizingRecommendationRequest if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SapSizingRecommendationRequest.
     */
    public static SapSizingRecommendationRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SapSizingRecommendationRequest deserializedSapSizingRecommendationRequest
                = new SapSizingRecommendationRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("appLocation".equals(fieldName)) {
                    deserializedSapSizingRecommendationRequest.appLocation = reader.getString();
                } else if ("environment".equals(fieldName)) {
                    deserializedSapSizingRecommendationRequest.environment
                        = SapEnvironmentType.fromString(reader.getString());
                } else if ("sapProduct".equals(fieldName)) {
                    deserializedSapSizingRecommendationRequest.sapProduct
                        = SapProductType.fromString(reader.getString());
                } else if ("deploymentType".equals(fieldName)) {
                    deserializedSapSizingRecommendationRequest.deploymentType
                        = SapDeploymentType.fromString(reader.getString());
                } else if ("saps".equals(fieldName)) {
                    deserializedSapSizingRecommendationRequest.saps = reader.getLong();
                } else if ("dbMemory".equals(fieldName)) {
                    deserializedSapSizingRecommendationRequest.dbMemory = reader.getLong();
                } else if ("databaseType".equals(fieldName)) {
                    deserializedSapSizingRecommendationRequest.databaseType
                        = SapDatabaseType.fromString(reader.getString());
                } else if ("dbScaleMethod".equals(fieldName)) {
                    deserializedSapSizingRecommendationRequest.dbScaleMethod
                        = SapDatabaseScaleMethod.fromString(reader.getString());
                } else if ("highAvailabilityType".equals(fieldName)) {
                    deserializedSapSizingRecommendationRequest.highAvailabilityType
                        = SapHighAvailabilityType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSapSizingRecommendationRequest;
        });
    }
}
