/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2014_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of a NotificationHub AdmCredential.
 */
public class AdmCredential {
    /**
     * Gets or sets properties of NotificationHub AdmCredential.
     */
    @JsonProperty(value = "properties")
    private AdmCredentialProperties properties;

    /**
     * Get gets or sets properties of NotificationHub AdmCredential.
     *
     * @return the properties value
     */
    public AdmCredentialProperties properties() {
        return this.properties;
    }

    /**
     * Set gets or sets properties of NotificationHub AdmCredential.
     *
     * @param properties the properties value to set
     * @return the AdmCredential object itself.
     */
    public AdmCredential withProperties(AdmCredentialProperties properties) {
        this.properties = properties;
        return this;
    }

}
