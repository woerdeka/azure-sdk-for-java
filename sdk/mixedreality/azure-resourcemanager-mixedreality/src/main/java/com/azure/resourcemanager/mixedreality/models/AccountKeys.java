// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.models;

import com.azure.resourcemanager.mixedreality.fluent.models.AccountKeysInner;

/**
 * An immutable client-side representation of AccountKeys.
 */
public interface AccountKeys {
    /**
     * Gets the primaryKey property: value of primary key.
     * 
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * Gets the secondaryKey property: value of secondary key.
     * 
     * @return the secondaryKey value.
     */
    String secondaryKey();

    /**
     * Gets the inner com.azure.resourcemanager.mixedreality.fluent.models.AccountKeysInner object.
     * 
     * @return the inner object.
     */
    AccountKeysInner innerModel();
}
