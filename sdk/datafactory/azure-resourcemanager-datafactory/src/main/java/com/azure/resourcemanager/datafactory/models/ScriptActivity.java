// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.ScriptActivityTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Script activity type.
 */
@Fluent
public final class ScriptActivity extends ExecutionActivity {
    /*
     * Type of activity.
     */
    private String type = "Script";

    /*
     * Script activity properties.
     */
    private ScriptActivityTypeProperties innerTypeProperties = new ScriptActivityTypeProperties();

    /**
     * Creates an instance of ScriptActivity class.
     */
    public ScriptActivity() {
    }

    /**
     * Get the type property: Type of activity.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Script activity properties.
     * 
     * @return the innerTypeProperties value.
     */
    private ScriptActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScriptActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScriptActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScriptActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScriptActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScriptActivity withState(ActivityState state) {
        super.withState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScriptActivity withOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.withOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScriptActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScriptActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the scriptBlockExecutionTimeout property: ScriptBlock execution timeout. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @return the scriptBlockExecutionTimeout value.
     */
    public Object scriptBlockExecutionTimeout() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().scriptBlockExecutionTimeout();
    }

    /**
     * Set the scriptBlockExecutionTimeout property: ScriptBlock execution timeout. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     * @param scriptBlockExecutionTimeout the scriptBlockExecutionTimeout value to set.
     * @return the ScriptActivity object itself.
     */
    public ScriptActivity withScriptBlockExecutionTimeout(Object scriptBlockExecutionTimeout) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ScriptActivityTypeProperties();
        }
        this.innerTypeProperties().withScriptBlockExecutionTimeout(scriptBlockExecutionTimeout);
        return this;
    }

    /**
     * Get the scripts property: Array of script blocks. Type: array.
     * 
     * @return the scripts value.
     */
    public List<ScriptActivityScriptBlock> scripts() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().scripts();
    }

    /**
     * Set the scripts property: Array of script blocks. Type: array.
     * 
     * @param scripts the scripts value to set.
     * @return the ScriptActivity object itself.
     */
    public ScriptActivity withScripts(List<ScriptActivityScriptBlock> scripts) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ScriptActivityTypeProperties();
        }
        this.innerTypeProperties().withScripts(scripts);
        return this;
    }

    /**
     * Get the logSettings property: Log settings of script activity.
     * 
     * @return the logSettings value.
     */
    public ScriptActivityTypePropertiesLogSettings logSettings() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().logSettings();
    }

    /**
     * Set the logSettings property: Log settings of script activity.
     * 
     * @param logSettings the logSettings value to set.
     * @return the ScriptActivity object itself.
     */
    public ScriptActivity withLogSettings(ScriptActivityTypePropertiesLogSettings logSettings) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ScriptActivityTypeProperties();
        }
        this.innerTypeProperties().withLogSettings(logSettings);
        return this;
    }

    /**
     * Get the returnMultistatementResult property: Enable to retrieve result sets from multiple SQL statements and the
     * number of rows affected by the DML statement. Supported connector: SnowflakeV2. Type: boolean (or Expression with
     * resultType boolean).
     * 
     * @return the returnMultistatementResult value.
     */
    public Object returnMultistatementResult() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().returnMultistatementResult();
    }

    /**
     * Set the returnMultistatementResult property: Enable to retrieve result sets from multiple SQL statements and the
     * number of rows affected by the DML statement. Supported connector: SnowflakeV2. Type: boolean (or Expression with
     * resultType boolean).
     * 
     * @param returnMultistatementResult the returnMultistatementResult value to set.
     * @return the ScriptActivity object itself.
     */
    public ScriptActivity withReturnMultistatementResult(Object returnMultistatementResult) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ScriptActivityTypeProperties();
        }
        this.innerTypeProperties().withReturnMultistatementResult(returnMultistatementResult);
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
                    "Missing required property innerTypeProperties in model ScriptActivity"));
        } else {
            innerTypeProperties().validate();
        }
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model ScriptActivity"));
        }
        if (dependsOn() != null) {
            dependsOn().forEach(e -> e.validate());
        }
        if (userProperties() != null) {
            userProperties().forEach(e -> e.validate());
        }
        if (linkedServiceName() != null) {
            linkedServiceName().validate();
        }
        if (policy() != null) {
            policy().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScriptActivity.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeStringField("state", state() == null ? null : state().toString());
        jsonWriter.writeStringField("onInactiveMarkAs",
            onInactiveMarkAs() == null ? null : onInactiveMarkAs().toString());
        jsonWriter.writeArrayField("dependsOn", dependsOn(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("userProperties", userProperties(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("linkedServiceName", linkedServiceName());
        jsonWriter.writeJsonField("policy", policy());
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
     * Reads an instance of ScriptActivity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScriptActivity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ScriptActivity.
     */
    public static ScriptActivity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScriptActivity deserializedScriptActivity = new ScriptActivity();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedScriptActivity.withName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedScriptActivity.withDescription(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedScriptActivity.withState(ActivityState.fromString(reader.getString()));
                } else if ("onInactiveMarkAs".equals(fieldName)) {
                    deserializedScriptActivity
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.fromString(reader.getString()));
                } else if ("dependsOn".equals(fieldName)) {
                    List<ActivityDependency> dependsOn
                        = reader.readArray(reader1 -> ActivityDependency.fromJson(reader1));
                    deserializedScriptActivity.withDependsOn(dependsOn);
                } else if ("userProperties".equals(fieldName)) {
                    List<UserProperty> userProperties = reader.readArray(reader1 -> UserProperty.fromJson(reader1));
                    deserializedScriptActivity.withUserProperties(userProperties);
                } else if ("linkedServiceName".equals(fieldName)) {
                    deserializedScriptActivity.withLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("policy".equals(fieldName)) {
                    deserializedScriptActivity.withPolicy(ActivityPolicy.fromJson(reader));
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedScriptActivity.innerTypeProperties = ScriptActivityTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedScriptActivity.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedScriptActivity.withAdditionalProperties(additionalProperties);

            return deserializedScriptActivity;
        });
    }
}
