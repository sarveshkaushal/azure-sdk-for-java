// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ReadReceiptsCollection model. */
@Immutable
public final class ReadReceiptsCollection {
    /*
     * Collection of read receipts.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReadReceipt> value;

    /*
     * If there are more read receipts that can be retrieved, the next link
     * will be populated.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Collection of read receipts.
     *
     * @return the value value.
     */
    public List<ReadReceipt> getValue() {
        return this.value;
    }

    /**
     * Get the nextLink property: If there are more read receipts that can be retrieved, the next link will be
     * populated.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
