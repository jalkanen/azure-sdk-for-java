/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Trigger reference type.
 */
public class TriggerReference {
    /**
     * Trigger reference type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Reference trigger name.
     */
    @JsonProperty(value = "referenceName", required = true)
    private String referenceName;

    /**
     * Creates an instance of TriggerReference class.
     * @param referenceName reference trigger name.
     */
    public TriggerReference() {
        type = "TriggerReference";
    }

    /**
     * Get trigger reference type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set trigger reference type.
     *
     * @param type the type value to set
     * @return the TriggerReference object itself.
     */
    public TriggerReference withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get reference trigger name.
     *
     * @return the referenceName value
     */
    public String referenceName() {
        return this.referenceName;
    }

    /**
     * Set reference trigger name.
     *
     * @param referenceName the referenceName value to set
     * @return the TriggerReference object itself.
     */
    public TriggerReference withReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

}
