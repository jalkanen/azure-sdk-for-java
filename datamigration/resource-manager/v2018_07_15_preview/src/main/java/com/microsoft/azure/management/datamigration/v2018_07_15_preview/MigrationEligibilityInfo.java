/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about migration eligibility of a server object.
 */
public class MigrationEligibilityInfo {
    /**
     * Whether object is eligible for migration or not.
     */
    @JsonProperty(value = "isEligibileForMigration", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isEligibileForMigration;

    /**
     * Information about eligibility failure for the server object.
     */
    @JsonProperty(value = "validationMessages", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> validationMessages;

    /**
     * Get whether object is eligible for migration or not.
     *
     * @return the isEligibileForMigration value
     */
    public Boolean isEligibileForMigration() {
        return this.isEligibileForMigration;
    }

    /**
     * Get information about eligibility failure for the server object.
     *
     * @return the validationMessages value
     */
    public List<String> validationMessages() {
        return this.validationMessages;
    }

}
