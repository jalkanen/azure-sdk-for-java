/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.implementation.api;

import org.joda.time.Period;

/**
 * Constraints to apply to the Job Manager task.
 */
public class TaskConstraintsInner {
    /**
     * Gets or sets the maximum elapsed time that the task may run, measured
     * from the time the task starts. If the task does not complete within
     * the time limit, the Batch service terminates it.
     */
    private Period maxWallClockTime;

    /**
     * Gets or sets the minimum time to retain the working directory for the
     * task on the compute node where it ran. After this time, the Batch
     * service may delete the working directory and all its contents. The
     * default is infinite.
     */
    private Period retentionTime;

    /**
     * Gets or sets the maximum number of times the task may be retried. The
     * Batch service retries a task if its exit code is nonzero.
     */
    private Integer maxTaskRetryCount;

    /**
     * Get the maxWallClockTime value.
     *
     * @return the maxWallClockTime value
     */
    public Period maxWallClockTime() {
        return this.maxWallClockTime;
    }

    /**
     * Set the maxWallClockTime value.
     *
     * @param maxWallClockTime the maxWallClockTime value to set
     * @return the TaskConstraintsInner object itself.
     */
    public TaskConstraintsInner setMaxWallClockTime(Period maxWallClockTime) {
        this.maxWallClockTime = maxWallClockTime;
        return this;
    }

    /**
     * Get the retentionTime value.
     *
     * @return the retentionTime value
     */
    public Period retentionTime() {
        return this.retentionTime;
    }

    /**
     * Set the retentionTime value.
     *
     * @param retentionTime the retentionTime value to set
     * @return the TaskConstraintsInner object itself.
     */
    public TaskConstraintsInner setRetentionTime(Period retentionTime) {
        this.retentionTime = retentionTime;
        return this;
    }

    /**
     * Get the maxTaskRetryCount value.
     *
     * @return the maxTaskRetryCount value
     */
    public Integer maxTaskRetryCount() {
        return this.maxTaskRetryCount;
    }

    /**
     * Set the maxTaskRetryCount value.
     *
     * @param maxTaskRetryCount the maxTaskRetryCount value to set
     * @return the TaskConstraintsInner object itself.
     */
    public TaskConstraintsInner setMaxTaskRetryCount(Integer maxTaskRetryCount) {
        this.maxTaskRetryCount = maxTaskRetryCount;
        return this;
    }

}