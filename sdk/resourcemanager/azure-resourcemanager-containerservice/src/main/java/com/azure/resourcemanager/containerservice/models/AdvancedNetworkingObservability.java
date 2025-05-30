// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Observability profile to enable advanced network metrics and flow logs with historical contexts.
 */
@Fluent
public final class AdvancedNetworkingObservability implements JsonSerializable<AdvancedNetworkingObservability> {
    /*
     * Indicates the enablement of Advanced Networking observability functionalities on clusters.
     */
    private Boolean enabled;

    /**
     * Creates an instance of AdvancedNetworkingObservability class.
     */
    public AdvancedNetworkingObservability() {
    }

    /**
     * Get the enabled property: Indicates the enablement of Advanced Networking observability functionalities on
     * clusters.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates the enablement of Advanced Networking observability functionalities on
     * clusters.
     * 
     * @param enabled the enabled value to set.
     * @return the AdvancedNetworkingObservability object itself.
     */
    public AdvancedNetworkingObservability withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AdvancedNetworkingObservability from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AdvancedNetworkingObservability if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AdvancedNetworkingObservability.
     */
    public static AdvancedNetworkingObservability fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AdvancedNetworkingObservability deserializedAdvancedNetworkingObservability
                = new AdvancedNetworkingObservability();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedAdvancedNetworkingObservability.enabled = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAdvancedNetworkingObservability;
        });
    }
}
