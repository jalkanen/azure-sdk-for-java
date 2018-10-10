/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedserviceidentity.v2015_08_31_preview.implementation;

import com.microsoft.azure.management.managedserviceidentity.v2015_08_31_preview.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Microsoft.ManagedIdentity Operation.
 * Operation supported by the Microsoft.ManagedIdentity REST API.
 */
public class OperationInner {
    /**
     * Operation Name.
     * The name of the REST Operation. This is of the format
     * {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Operation Display.
     * The object that describes the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * Get the name of the REST Operation. This is of the format {provider}/{resource}/{operation}.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the REST Operation. This is of the format {provider}/{resource}/{operation}.
     *
     * @param name the name value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the object that describes the operation.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the object that describes the operation.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

}