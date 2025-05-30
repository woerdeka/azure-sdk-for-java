// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Disk represents the properties of the disk.
 */
@Immutable
public final class MachineDisk implements JsonSerializable<MachineDisk> {
    /*
     * The maximum amount of storage. Measured in gibibytes.
     */
    private Long capacityGB;

    /*
     * The connection type of the rack SKU resource.
     */
    private MachineSkuDiskConnectionType connection;

    /*
     * The disk type of rack SKU resource.
     */
    private DiskType type;

    /**
     * Creates an instance of MachineDisk class.
     */
    public MachineDisk() {
    }

    /**
     * Get the capacityGB property: The maximum amount of storage. Measured in gibibytes.
     * 
     * @return the capacityGB value.
     */
    public Long capacityGB() {
        return this.capacityGB;
    }

    /**
     * Get the connection property: The connection type of the rack SKU resource.
     * 
     * @return the connection value.
     */
    public MachineSkuDiskConnectionType connection() {
        return this.connection;
    }

    /**
     * Get the type property: The disk type of rack SKU resource.
     * 
     * @return the type value.
     */
    public DiskType type() {
        return this.type;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MachineDisk from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MachineDisk if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MachineDisk.
     */
    public static MachineDisk fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MachineDisk deserializedMachineDisk = new MachineDisk();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("capacityGB".equals(fieldName)) {
                    deserializedMachineDisk.capacityGB = reader.getNullable(JsonReader::getLong);
                } else if ("connection".equals(fieldName)) {
                    deserializedMachineDisk.connection = MachineSkuDiskConnectionType.fromString(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedMachineDisk.type = DiskType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMachineDisk;
        });
    }
}
