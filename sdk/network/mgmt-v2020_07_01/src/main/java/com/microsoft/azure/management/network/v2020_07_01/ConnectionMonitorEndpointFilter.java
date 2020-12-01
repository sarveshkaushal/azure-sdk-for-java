/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the connection monitor endpoint filter.
 */
public class ConnectionMonitorEndpointFilter {
    /**
     * The behavior of the endpoint filter. Currently only 'Include' is
     * supported. Possible values include: 'Include'.
     */
    @JsonProperty(value = "type")
    private ConnectionMonitorEndpointFilterType type;

    /**
     * List of items in the filter.
     */
    @JsonProperty(value = "items")
    private List<ConnectionMonitorEndpointFilterItem> items;

    /**
     * Get the behavior of the endpoint filter. Currently only 'Include' is supported. Possible values include: 'Include'.
     *
     * @return the type value
     */
    public ConnectionMonitorEndpointFilterType type() {
        return this.type;
    }

    /**
     * Set the behavior of the endpoint filter. Currently only 'Include' is supported. Possible values include: 'Include'.
     *
     * @param type the type value to set
     * @return the ConnectionMonitorEndpointFilter object itself.
     */
    public ConnectionMonitorEndpointFilter withType(ConnectionMonitorEndpointFilterType type) {
        this.type = type;
        return this;
    }

    /**
     * Get list of items in the filter.
     *
     * @return the items value
     */
    public List<ConnectionMonitorEndpointFilterItem> items() {
        return this.items;
    }

    /**
     * Set list of items in the filter.
     *
     * @param items the items value to set
     * @return the ConnectionMonitorEndpointFilter object itself.
     */
    public ConnectionMonitorEndpointFilter withItems(List<ConnectionMonitorEndpointFilterItem> items) {
        this.items = items;
        return this;
    }

}
