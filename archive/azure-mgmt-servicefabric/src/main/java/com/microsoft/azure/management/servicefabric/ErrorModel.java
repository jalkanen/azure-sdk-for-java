/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The structure of the error.
 */
public class ErrorModel {
    /**
     * The error detail.
     */
    @JsonProperty(value = "error")
    private ErrorModelError error;

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public ErrorModelError error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the ErrorModel object itself.
     */
    public ErrorModel withError(ErrorModelError error) {
        this.error = error;
        return this;
    }

}