/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Model for NotificationSetting.
 */
@JsonFlatten
public class NotificationSettingInner extends ProxyResource {
    /**
     * For optimistic concurrency control.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * List of action group resource ids to be notified.
     */
    @JsonProperty(value = "properties.actionGroupResourceIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> actionGroupResourceIds;

    /**
     * Get for optimistic concurrency control.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get list of action group resource ids to be notified.
     *
     * @return the actionGroupResourceIds value
     */
    public List<String> actionGroupResourceIds() {
        return this.actionGroupResourceIds;
    }

}