/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base properties for any task step.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TaskStepProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Docker", value = DockerBuildStep.class),
    @JsonSubTypes.Type(name = "BuildTask", value = BuildTaskStep.class),
    @JsonSubTypes.Type(name = "RunTask", value = RunTaskStep.class)
})
public class TaskStepProperties {
    /**
     * List of base image dependencies for a step.
     */
    @JsonProperty(value = "baseImageDependencies", access = JsonProperty.Access.WRITE_ONLY)
    private List<BaseImageDependency> baseImageDependencies;

    /**
     * Get list of base image dependencies for a step.
     *
     * @return the baseImageDependencies value
     */
    public List<BaseImageDependency> baseImageDependencies() {
        return this.baseImageDependencies;
    }

}
