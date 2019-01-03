/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * This activity blocks execution until a file has been validated to exist with
 * an optional minimum size or timeout is reached, whichever is earlier.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Validation")
@JsonFlatten
public class ValidationActivity extends ControlActivity {
    /**
     * Specifies the timeout for the activity to run. If there is no value
     * specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as
     * default. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])). Type: string (or
     * Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "typeProperties.timeout")
    private Object timeout;

    /**
     * A delay in seconds between validation attempts. If no value is
     * specified, 10 seconds will be used as the default.
     */
    @JsonProperty(value = "typeProperties.sleep")
    private Integer sleep;

    /**
     * Minimum size of a file in byte. If no value is specified, 0 byte will be
     * used as the default.
     */
    @JsonProperty(value = "typeProperties.minimumSize")
    private Integer minimumSize;

    /**
     * Validation activity dataset reference.
     */
    @JsonProperty(value = "typeProperties.dataset", required = true)
    private DatasetReference dataset;

    /**
     * Get specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])). Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the timeout value
     */
    public Object timeout() {
        return this.timeout;
    }

    /**
     * Set specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])). Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param timeout the timeout value to set
     * @return the ValidationActivity object itself.
     */
    public ValidationActivity withTimeout(Object timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get a delay in seconds between validation attempts. If no value is specified, 10 seconds will be used as the default.
     *
     * @return the sleep value
     */
    public Integer sleep() {
        return this.sleep;
    }

    /**
     * Set a delay in seconds between validation attempts. If no value is specified, 10 seconds will be used as the default.
     *
     * @param sleep the sleep value to set
     * @return the ValidationActivity object itself.
     */
    public ValidationActivity withSleep(Integer sleep) {
        this.sleep = sleep;
        return this;
    }

    /**
     * Get minimum size of a file in byte. If no value is specified, 0 byte will be used as the default.
     *
     * @return the minimumSize value
     */
    public Integer minimumSize() {
        return this.minimumSize;
    }

    /**
     * Set minimum size of a file in byte. If no value is specified, 0 byte will be used as the default.
     *
     * @param minimumSize the minimumSize value to set
     * @return the ValidationActivity object itself.
     */
    public ValidationActivity withMinimumSize(Integer minimumSize) {
        this.minimumSize = minimumSize;
        return this;
    }

    /**
     * Get validation activity dataset reference.
     *
     * @return the dataset value
     */
    public DatasetReference dataset() {
        return this.dataset;
    }

    /**
     * Set validation activity dataset reference.
     *
     * @param dataset the dataset value to set
     * @return the ValidationActivity object itself.
     */
    public ValidationActivity withDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }

}
