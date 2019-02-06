/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2017_03;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ProvisioningState.
 */
public final class ProvisioningState extends ExpandableStringEnum<ProvisioningState> {
    /** Static value Created for ProvisioningState. */
    public static final ProvisioningState CREATED = fromString("Created");

    /** Static value InProgress for ProvisioningState. */
    public static final ProvisioningState IN_PROGRESS = fromString("InProgress");

    /** Static value Succeeded for ProvisioningState. */
    public static final ProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ProvisioningState. */
    public static final ProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for ProvisioningState. */
    public static final ProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates or finds a ProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding ProvisioningState
     */
    @JsonCreator
    public static ProvisioningState fromString(String name) {
        return fromString(name, ProvisioningState.class);
    }

    /**
     * @return known ProvisioningState values
     */
    public static Collection<ProvisioningState> values() {
        return values(ProvisioningState.class);
    }
}