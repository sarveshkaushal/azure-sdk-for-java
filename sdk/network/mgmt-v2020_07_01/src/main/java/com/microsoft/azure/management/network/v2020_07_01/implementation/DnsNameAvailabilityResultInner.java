/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for the CheckDnsNameAvailability API service call.
 */
public class DnsNameAvailabilityResultInner {
    /**
     * Domain availability (True/False).
     */
    @JsonProperty(value = "available")
    private Boolean available;

    /**
     * Get domain availability (True/False).
     *
     * @return the available value
     */
    public Boolean available() {
        return this.available;
    }

    /**
     * Set domain availability (True/False).
     *
     * @param available the available value to set
     * @return the DnsNameAvailabilityResultInner object itself.
     */
    public DnsNameAvailabilityResultInner withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

}
