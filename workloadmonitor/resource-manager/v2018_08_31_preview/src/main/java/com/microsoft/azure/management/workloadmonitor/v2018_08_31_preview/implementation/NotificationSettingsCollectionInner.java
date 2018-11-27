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

/**
 * Model for collection of notificationSettings.
 */
public class NotificationSettingsCollectionInner {
    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<NotificationSettingInner> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<NotificationSettingInner> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the NotificationSettingsCollectionInner object itself.
     */
    public NotificationSettingsCollectionInner withValue(List<NotificationSettingInner> value) {
        this.value = value;
        return this;
    }

}