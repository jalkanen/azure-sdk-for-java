/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabricmesh.implementation;

import com.microsoft.azure.management.servicefabricmesh.SecretResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;

/**
 * This type describes a secret resource.
 */
public class SecretResourceDescriptionInner extends Resource {
    /**
     * Describes the properties of a secret resource.
     */
    @JsonProperty(value = "properties", required = true)
    private SecretResourceProperties properties;

    /**
     * Get describes the properties of a secret resource.
     *
     * @return the properties value
     */
    public SecretResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set describes the properties of a secret resource.
     *
     * @param properties the properties value to set
     * @return the SecretResourceDescriptionInner object itself.
     */
    public SecretResourceDescriptionInner withProperties(SecretResourceProperties properties) {
        this.properties = properties;
        return this;
    }

}