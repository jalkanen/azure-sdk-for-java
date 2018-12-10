/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApplicationStatus.
 */
public final class ApplicationStatus extends ExpandableStringEnum<ApplicationStatus> {
    /** Static value Invalid for ApplicationStatus. */
    public static final ApplicationStatus INVALID = fromString("Invalid");

    /** Static value Ready for ApplicationStatus. */
    public static final ApplicationStatus READY = fromString("Ready");

    /** Static value Upgrading for ApplicationStatus. */
    public static final ApplicationStatus UPGRADING = fromString("Upgrading");

    /** Static value Creating for ApplicationStatus. */
    public static final ApplicationStatus CREATING = fromString("Creating");

    /** Static value Deleting for ApplicationStatus. */
    public static final ApplicationStatus DELETING = fromString("Deleting");

    /** Static value Failed for ApplicationStatus. */
    public static final ApplicationStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a ApplicationStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationStatus
     */
    @JsonCreator
    public static ApplicationStatus fromString(String name) {
        return fromString(name, ApplicationStatus.class);
    }

    /**
     * @return known ApplicationStatus values
     */
    public static Collection<ApplicationStatus> values() {
        return values(ApplicationStatus.class);
    }
}