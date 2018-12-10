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
 * Defines an item in ChaosParametersDictionary of the Chaos Schedule.
 */
public class ChaosParametersDictionaryItem {
    /**
     * The key identifying the Chaos Parameter in the dictionary. This key is
     * referenced by Chaos Schedule Jobs.
     */
    @JsonProperty(value = "Key", required = true)
    private String key;

    /**
     * Defines all the parameters to configure a Chaos run.
     */
    @JsonProperty(value = "Value", required = true)
    private ChaosParameters value;

    /**
     * Get the key identifying the Chaos Parameter in the dictionary. This key is referenced by Chaos Schedule Jobs.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key identifying the Chaos Parameter in the dictionary. This key is referenced by Chaos Schedule Jobs.
     *
     * @param key the key value to set
     * @return the ChaosParametersDictionaryItem object itself.
     */
    public ChaosParametersDictionaryItem withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get defines all the parameters to configure a Chaos run.
     *
     * @return the value value
     */
    public ChaosParameters value() {
        return this.value;
    }

    /**
     * Set defines all the parameters to configure a Chaos run.
     *
     * @param value the value value to set
     * @return the ChaosParametersDictionaryItem object itself.
     */
    public ChaosParametersDictionaryItem withValue(ChaosParameters value) {
        this.value = value;
        return this;
    }

}