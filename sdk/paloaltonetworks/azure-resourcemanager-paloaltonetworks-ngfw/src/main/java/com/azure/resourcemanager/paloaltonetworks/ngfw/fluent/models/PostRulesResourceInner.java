// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ActionEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.BooleanEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.Category;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DecryptionRuleTypeEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DestinationAddr;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ProvisioningState;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SourceAddr;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.StateEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.TagInfo;
import java.io.IOException;
import java.util.List;

/**
 * PostRulestack rule list.
 */
@Fluent
public final class PostRulesResourceInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    private RuleEntry innerProperties = new RuleEntry();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of PostRulesResourceInner class.
     */
    public PostRulesResourceInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private RuleEntry innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the etag property: etag info.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.innerProperties() == null ? null : this.innerProperties().etag();
    }

    /**
     * Set the etag property: etag info.
     * 
     * @param etag the etag value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withEtag(String etag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withEtag(etag);
        return this;
    }

    /**
     * Get the ruleName property: rule name.
     * 
     * @return the ruleName value.
     */
    public String ruleName() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleName();
    }

    /**
     * Set the ruleName property: rule name.
     * 
     * @param ruleName the ruleName value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withRuleName(String ruleName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withRuleName(ruleName);
        return this;
    }

    /**
     * Get the priority property: The priority property.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.innerProperties() == null ? null : this.innerProperties().priority();
    }

    /**
     * Get the description property: rule description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: rule description.
     * 
     * @param description the description value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the ruleState property: state of this rule.
     * 
     * @return the ruleState value.
     */
    public StateEnum ruleState() {
        return this.innerProperties() == null ? null : this.innerProperties().ruleState();
    }

    /**
     * Set the ruleState property: state of this rule.
     * 
     * @param ruleState the ruleState value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withRuleState(StateEnum ruleState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withRuleState(ruleState);
        return this;
    }

    /**
     * Get the source property: source address.
     * 
     * @return the source value.
     */
    public SourceAddr source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: source address.
     * 
     * @param source the source value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withSource(SourceAddr source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the negateSource property: cidr should not be 'any'.
     * 
     * @return the negateSource value.
     */
    public BooleanEnum negateSource() {
        return this.innerProperties() == null ? null : this.innerProperties().negateSource();
    }

    /**
     * Set the negateSource property: cidr should not be 'any'.
     * 
     * @param negateSource the negateSource value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withNegateSource(BooleanEnum negateSource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withNegateSource(negateSource);
        return this;
    }

    /**
     * Get the destination property: destination address.
     * 
     * @return the destination value.
     */
    public DestinationAddr destination() {
        return this.innerProperties() == null ? null : this.innerProperties().destination();
    }

    /**
     * Set the destination property: destination address.
     * 
     * @param destination the destination value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withDestination(DestinationAddr destination) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withDestination(destination);
        return this;
    }

    /**
     * Get the negateDestination property: cidr should not be 'any'.
     * 
     * @return the negateDestination value.
     */
    public BooleanEnum negateDestination() {
        return this.innerProperties() == null ? null : this.innerProperties().negateDestination();
    }

    /**
     * Set the negateDestination property: cidr should not be 'any'.
     * 
     * @param negateDestination the negateDestination value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withNegateDestination(BooleanEnum negateDestination) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withNegateDestination(negateDestination);
        return this;
    }

    /**
     * Get the applications property: array of rule applications.
     * 
     * @return the applications value.
     */
    public List<String> applications() {
        return this.innerProperties() == null ? null : this.innerProperties().applications();
    }

    /**
     * Set the applications property: array of rule applications.
     * 
     * @param applications the applications value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withApplications(List<String> applications) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withApplications(applications);
        return this;
    }

    /**
     * Get the category property: rule category.
     * 
     * @return the category value.
     */
    public Category category() {
        return this.innerProperties() == null ? null : this.innerProperties().category();
    }

    /**
     * Set the category property: rule category.
     * 
     * @param category the category value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withCategory(Category category) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withCategory(category);
        return this;
    }

    /**
     * Get the protocol property: any, application-default, TCP:number, UDP:number.
     * 
     * @return the protocol value.
     */
    public String protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: any, application-default, TCP:number, UDP:number.
     * 
     * @param protocol the protocol value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withProtocol(String protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the protocolPortList property: prot port list.
     * 
     * @return the protocolPortList value.
     */
    public List<String> protocolPortList() {
        return this.innerProperties() == null ? null : this.innerProperties().protocolPortList();
    }

    /**
     * Set the protocolPortList property: prot port list.
     * 
     * @param protocolPortList the protocolPortList value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withProtocolPortList(List<String> protocolPortList) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withProtocolPortList(protocolPortList);
        return this;
    }

    /**
     * Get the inboundInspectionCertificate property: inbound Inspection Certificate.
     * 
     * @return the inboundInspectionCertificate value.
     */
    public String inboundInspectionCertificate() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundInspectionCertificate();
    }

    /**
     * Set the inboundInspectionCertificate property: inbound Inspection Certificate.
     * 
     * @param inboundInspectionCertificate the inboundInspectionCertificate value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withInboundInspectionCertificate(String inboundInspectionCertificate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withInboundInspectionCertificate(inboundInspectionCertificate);
        return this;
    }

    /**
     * Get the auditComment property: rule comment.
     * 
     * @return the auditComment value.
     */
    public String auditComment() {
        return this.innerProperties() == null ? null : this.innerProperties().auditComment();
    }

    /**
     * Set the auditComment property: rule comment.
     * 
     * @param auditComment the auditComment value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withAuditComment(String auditComment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withAuditComment(auditComment);
        return this;
    }

    /**
     * Get the actionType property: rule action.
     * 
     * @return the actionType value.
     */
    public ActionEnum actionType() {
        return this.innerProperties() == null ? null : this.innerProperties().actionType();
    }

    /**
     * Set the actionType property: rule action.
     * 
     * @param actionType the actionType value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withActionType(ActionEnum actionType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withActionType(actionType);
        return this;
    }

    /**
     * Get the enableLogging property: enable or disable logging.
     * 
     * @return the enableLogging value.
     */
    public StateEnum enableLogging() {
        return this.innerProperties() == null ? null : this.innerProperties().enableLogging();
    }

    /**
     * Set the enableLogging property: enable or disable logging.
     * 
     * @param enableLogging the enableLogging value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withEnableLogging(StateEnum enableLogging) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withEnableLogging(enableLogging);
        return this;
    }

    /**
     * Get the decryptionRuleType property: enable or disable decryption.
     * 
     * @return the decryptionRuleType value.
     */
    public DecryptionRuleTypeEnum decryptionRuleType() {
        return this.innerProperties() == null ? null : this.innerProperties().decryptionRuleType();
    }

    /**
     * Set the decryptionRuleType property: enable or disable decryption.
     * 
     * @param decryptionRuleType the decryptionRuleType value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withDecryptionRuleType(DecryptionRuleTypeEnum decryptionRuleType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withDecryptionRuleType(decryptionRuleType);
        return this;
    }

    /**
     * Get the tags property: tag for rule.
     * 
     * @return the tags value.
     */
    public List<TagInfo> tags() {
        return this.innerProperties() == null ? null : this.innerProperties().tags();
    }

    /**
     * Set the tags property: tag for rule.
     * 
     * @param tags the tags value to set.
     * @return the PostRulesResourceInner object itself.
     */
    public PostRulesResourceInner withTags(List<TagInfo> tags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RuleEntry();
        }
        this.innerProperties().withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerProperties in model PostRulesResourceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PostRulesResourceInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PostRulesResourceInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PostRulesResourceInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PostRulesResourceInner.
     */
    public static PostRulesResourceInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PostRulesResourceInner deserializedPostRulesResourceInner = new PostRulesResourceInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPostRulesResourceInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPostRulesResourceInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPostRulesResourceInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPostRulesResourceInner.innerProperties = RuleEntry.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedPostRulesResourceInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPostRulesResourceInner;
        });
    }
}
