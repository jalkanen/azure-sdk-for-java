/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes a Service Fabric property value.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("PropertyValue")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Binary", value = BinaryPropertyValue.class),
    @JsonSubTypes.Type(name = "Int64", value = Int64PropertyValue.class),
    @JsonSubTypes.Type(name = "Double", value = DoublePropertyValue.class),
    @JsonSubTypes.Type(name = "String", value = StringPropertyValue.class),
    @JsonSubTypes.Type(name = "Guid", value = GuidPropertyValue.class)
})
public class PropertyValue {
}