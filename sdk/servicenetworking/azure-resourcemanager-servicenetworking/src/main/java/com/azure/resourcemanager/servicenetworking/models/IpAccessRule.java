// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicenetworking.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Ip Access Policy Rules.
 */
@Fluent
public final class IpAccessRule implements JsonSerializable<IpAccessRule> {
    /*
     * Name of the Ip Access Rule
     */
    private String name;

    /*
     * The priority of the rule. The value can be between 1 and 500. The priority number must be unique for each rule in
     * the collection. The lower the priority number, the higher the priority of the rule.
     */
    private int priority;

    /*
     * Source Address Prefixed Applied by the Rule. Asterisk '*' can also be used to match all source IPs.
     */
    private List<String> sourceAddressPrefixes;

    /*
     * Action of the Rule
     */
    private IpAccessRuleAction action;

    /**
     * Creates an instance of IpAccessRule class.
     */
    public IpAccessRule() {
    }

    /**
     * Get the name property: Name of the Ip Access Rule.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Ip Access Rule.
     * 
     * @param name the name value to set.
     * @return the IpAccessRule object itself.
     */
    public IpAccessRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the priority property: The priority of the rule. The value can be between 1 and 500. The priority number must
     * be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     * @return the priority value.
     */
    public int priority() {
        return this.priority;
    }

    /**
     * Set the priority property: The priority of the rule. The value can be between 1 and 500. The priority number must
     * be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     * @param priority the priority value to set.
     * @return the IpAccessRule object itself.
     */
    public IpAccessRule withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the sourceAddressPrefixes property: Source Address Prefixed Applied by the Rule. Asterisk '*' can also be
     * used to match all source IPs.
     * 
     * @return the sourceAddressPrefixes value.
     */
    public List<String> sourceAddressPrefixes() {
        return this.sourceAddressPrefixes;
    }

    /**
     * Set the sourceAddressPrefixes property: Source Address Prefixed Applied by the Rule. Asterisk '*' can also be
     * used to match all source IPs.
     * 
     * @param sourceAddressPrefixes the sourceAddressPrefixes value to set.
     * @return the IpAccessRule object itself.
     */
    public IpAccessRule withSourceAddressPrefixes(List<String> sourceAddressPrefixes) {
        this.sourceAddressPrefixes = sourceAddressPrefixes;
        return this;
    }

    /**
     * Get the action property: Action of the Rule.
     * 
     * @return the action value.
     */
    public IpAccessRuleAction action() {
        return this.action;
    }

    /**
     * Set the action property: Action of the Rule.
     * 
     * @param action the action value to set.
     * @return the IpAccessRule object itself.
     */
    public IpAccessRule withAction(IpAccessRuleAction action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model IpAccessRule"));
        }
        if (sourceAddressPrefixes() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sourceAddressPrefixes in model IpAccessRule"));
        }
        if (action() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property action in model IpAccessRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IpAccessRule.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeIntField("priority", this.priority);
        jsonWriter.writeArrayField("sourceAddressPrefixes", this.sourceAddressPrefixes,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("action", this.action == null ? null : this.action.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpAccessRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpAccessRule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IpAccessRule.
     */
    public static IpAccessRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpAccessRule deserializedIpAccessRule = new IpAccessRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedIpAccessRule.name = reader.getString();
                } else if ("priority".equals(fieldName)) {
                    deserializedIpAccessRule.priority = reader.getInt();
                } else if ("sourceAddressPrefixes".equals(fieldName)) {
                    List<String> sourceAddressPrefixes = reader.readArray(reader1 -> reader1.getString());
                    deserializedIpAccessRule.sourceAddressPrefixes = sourceAddressPrefixes;
                } else if ("action".equals(fieldName)) {
                    deserializedIpAccessRule.action = IpAccessRuleAction.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpAccessRule;
        });
    }
}
