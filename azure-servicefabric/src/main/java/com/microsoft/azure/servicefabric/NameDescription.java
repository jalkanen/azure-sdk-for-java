/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a Service Fabric name.
 */
public class NameDescription {
    /**
     * The Service Fabric name, including the 'fabric:' URI scheme.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /**
     * Get the Service Fabric name, including the 'fabric:' URI scheme.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the Service Fabric name, including the 'fabric:' URI scheme.
     *
     * @param name the name value to set
     * @return the NameDescription object itself.
     */
    public NameDescription withName(String name) {
        this.name = name;
        return this;
    }

}