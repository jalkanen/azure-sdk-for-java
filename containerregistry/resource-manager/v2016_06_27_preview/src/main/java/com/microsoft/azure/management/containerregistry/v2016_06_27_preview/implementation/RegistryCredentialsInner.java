/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2016_06_27_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The result of a request to get the administrator login credentials for a
 * container registry.
 */
public class RegistryCredentialsInner {
    /**
     * The administrator username.
     */
    @JsonProperty(value = "username")
    private String username;

    /**
     * The administrator password.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the administrator username.
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the administrator username.
     *
     * @param username the username value to set
     * @return the RegistryCredentialsInner object itself.
     */
    public RegistryCredentialsInner withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the administrator password.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the administrator password.
     *
     * @param password the password value to set
     * @return the RegistryCredentialsInner object itself.
     */
    public RegistryCredentialsInner withPassword(String password) {
        this.password = password;
        return this;
    }

}
