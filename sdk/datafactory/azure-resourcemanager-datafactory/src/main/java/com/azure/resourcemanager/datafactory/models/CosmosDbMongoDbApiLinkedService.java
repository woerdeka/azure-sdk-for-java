// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.CosmosDbMongoDbApiLinkedServiceTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Linked service for CosmosDB (MongoDB API) data source.
 */
@Fluent
public final class CosmosDbMongoDbApiLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "CosmosDbMongoDbApi";

    /*
     * CosmosDB (MongoDB API) linked service properties.
     */
    private CosmosDbMongoDbApiLinkedServiceTypeProperties innerTypeProperties
        = new CosmosDbMongoDbApiLinkedServiceTypeProperties();

    /**
     * Creates an instance of CosmosDbMongoDbApiLinkedService class.
     */
    public CosmosDbMongoDbApiLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: CosmosDB (MongoDB API) linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private CosmosDbMongoDbApiLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CosmosDbMongoDbApiLinkedService withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CosmosDbMongoDbApiLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CosmosDbMongoDbApiLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CosmosDbMongoDbApiLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CosmosDbMongoDbApiLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the isServerVersionAbove32 property: Whether the CosmosDB (MongoDB API) server version is higher than 3.2.
     * The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the isServerVersionAbove32 value.
     */
    public Object isServerVersionAbove32() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().isServerVersionAbove32();
    }

    /**
     * Set the isServerVersionAbove32 property: Whether the CosmosDB (MongoDB API) server version is higher than 3.2.
     * The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     * @param isServerVersionAbove32 the isServerVersionAbove32 value to set.
     * @return the CosmosDbMongoDbApiLinkedService object itself.
     */
    public CosmosDbMongoDbApiLinkedService withIsServerVersionAbove32(Object isServerVersionAbove32) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbMongoDbApiLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withIsServerVersionAbove32(isServerVersionAbove32);
        return this;
    }

    /**
     * Get the connectionString property: The CosmosDB (MongoDB API) connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectionString();
    }

    /**
     * Set the connectionString property: The CosmosDB (MongoDB API) connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the CosmosDbMongoDbApiLinkedService object itself.
     */
    public CosmosDbMongoDbApiLinkedService withConnectionString(Object connectionString) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbMongoDbApiLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withConnectionString(connectionString);
        return this;
    }

    /**
     * Get the database property: The name of the CosmosDB (MongoDB API) database that you want to access. Type: string
     * (or Expression with resultType string).
     * 
     * @return the database value.
     */
    public Object database() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().database();
    }

    /**
     * Set the database property: The name of the CosmosDB (MongoDB API) database that you want to access. Type: string
     * (or Expression with resultType string).
     * 
     * @param database the database value to set.
     * @return the CosmosDbMongoDbApiLinkedService object itself.
     */
    public CosmosDbMongoDbApiLinkedService withDatabase(Object database) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CosmosDbMongoDbApiLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withDatabase(database);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model CosmosDbMongoDbApiLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
        if (connectVia() != null) {
            connectVia().validate();
        }
        if (parameters() != null) {
            parameters().values().forEach(e -> {
                if (e != null) {
                    e.validate();
                }
            });
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CosmosDbMongoDbApiLinkedService.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("version", version());
        jsonWriter.writeJsonField("connectVia", connectVia());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeMapField("parameters", parameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", annotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CosmosDbMongoDbApiLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CosmosDbMongoDbApiLinkedService if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CosmosDbMongoDbApiLinkedService.
     */
    public static CosmosDbMongoDbApiLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CosmosDbMongoDbApiLinkedService deserializedCosmosDbMongoDbApiLinkedService
                = new CosmosDbMongoDbApiLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedCosmosDbMongoDbApiLinkedService.withVersion(reader.getString());
                } else if ("connectVia".equals(fieldName)) {
                    deserializedCosmosDbMongoDbApiLinkedService
                        .withConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedCosmosDbMongoDbApiLinkedService.withDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedCosmosDbMongoDbApiLinkedService.withParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedCosmosDbMongoDbApiLinkedService.withAnnotations(annotations);
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedCosmosDbMongoDbApiLinkedService.innerTypeProperties
                        = CosmosDbMongoDbApiLinkedServiceTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedCosmosDbMongoDbApiLinkedService.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedCosmosDbMongoDbApiLinkedService.withAdditionalProperties(additionalProperties);

            return deserializedCosmosDbMongoDbApiLinkedService;
        });
    }
}
