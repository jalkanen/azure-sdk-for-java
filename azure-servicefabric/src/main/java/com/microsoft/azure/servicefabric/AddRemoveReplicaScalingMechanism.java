/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes the horizontal auto scaling mechanism that adds or removes
 * replicas (containers or container groups).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AddRemoveReplica")
public class AddRemoveReplicaScalingMechanism extends AutoScalingMechanism {
    /**
     * Minimum number of containers (scale down won't be performed below this
     * number).
     */
    @JsonProperty(value = "minCount", required = true)
    private int minCount;

    /**
     * Maximum number of containers (scale up won't be performed above this
     * number).
     */
    @JsonProperty(value = "maxCount", required = true)
    private int maxCount;

    /**
     * Each time auto scaling is performed, this number of containers will be
     * added or removed.
     */
    @JsonProperty(value = "scaleIncrement", required = true)
    private int scaleIncrement;

    /**
     * Get minimum number of containers (scale down won't be performed below this number).
     *
     * @return the minCount value
     */
    public int minCount() {
        return this.minCount;
    }

    /**
     * Set minimum number of containers (scale down won't be performed below this number).
     *
     * @param minCount the minCount value to set
     * @return the AddRemoveReplicaScalingMechanism object itself.
     */
    public AddRemoveReplicaScalingMechanism withMinCount(int minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * Get maximum number of containers (scale up won't be performed above this number).
     *
     * @return the maxCount value
     */
    public int maxCount() {
        return this.maxCount;
    }

    /**
     * Set maximum number of containers (scale up won't be performed above this number).
     *
     * @param maxCount the maxCount value to set
     * @return the AddRemoveReplicaScalingMechanism object itself.
     */
    public AddRemoveReplicaScalingMechanism withMaxCount(int maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * Get each time auto scaling is performed, this number of containers will be added or removed.
     *
     * @return the scaleIncrement value
     */
    public int scaleIncrement() {
        return this.scaleIncrement;
    }

    /**
     * Set each time auto scaling is performed, this number of containers will be added or removed.
     *
     * @param scaleIncrement the scaleIncrement value to set
     * @return the AddRemoveReplicaScalingMechanism object itself.
     */
    public AddRemoveReplicaScalingMechanism withScaleIncrement(int scaleIncrement) {
        this.scaleIncrement = scaleIncrement;
        return this;
    }

}