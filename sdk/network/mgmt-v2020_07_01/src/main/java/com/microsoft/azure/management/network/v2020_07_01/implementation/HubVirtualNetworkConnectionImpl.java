/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.management.network.v2020_07_01.HubVirtualNetworkConnection;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_07_01.RoutingConfiguration;
import com.microsoft.azure.management.network.v2020_07_01.ProvisioningState;

class HubVirtualNetworkConnectionImpl extends CreatableUpdatableImpl<HubVirtualNetworkConnection, HubVirtualNetworkConnectionInner, HubVirtualNetworkConnectionImpl> implements HubVirtualNetworkConnection, HubVirtualNetworkConnection.Definition, HubVirtualNetworkConnection.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String virtualHubName;
    private String connectionName;

    HubVirtualNetworkConnectionImpl(String name, NetworkManager manager) {
        super(name, new HubVirtualNetworkConnectionInner());
        this.manager = manager;
        // Set resource name
        this.connectionName = name;
        //
    }

    HubVirtualNetworkConnectionImpl(HubVirtualNetworkConnectionInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.connectionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.virtualHubName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualHubs");
        this.connectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "hubVirtualNetworkConnections");
        //
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<HubVirtualNetworkConnection> createResourceAsync() {
        HubVirtualNetworkConnectionsInner client = this.manager().inner().hubVirtualNetworkConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualHubName, this.connectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<HubVirtualNetworkConnection> updateResourceAsync() {
        HubVirtualNetworkConnectionsInner client = this.manager().inner().hubVirtualNetworkConnections();
        return client.createOrUpdateAsync(this.resourceGroupName, this.virtualHubName, this.connectionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<HubVirtualNetworkConnectionInner> getInnerAsync() {
        HubVirtualNetworkConnectionsInner client = this.manager().inner().hubVirtualNetworkConnections();
        return client.getAsync(this.resourceGroupName, this.virtualHubName, this.connectionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Boolean allowHubToRemoteVnetTransit() {
        return this.inner().allowHubToRemoteVnetTransit();
    }

    @Override
    public Boolean allowRemoteVnetToUseHubVnetGateways() {
        return this.inner().allowRemoteVnetToUseHubVnetGateways();
    }

    @Override
    public Boolean enableInternetSecurity() {
        return this.inner().enableInternetSecurity();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public SubResource remoteVirtualNetwork() {
        return this.inner().remoteVirtualNetwork();
    }

    @Override
    public RoutingConfiguration routingConfiguration() {
        return this.inner().routingConfiguration();
    }

    @Override
    public HubVirtualNetworkConnectionImpl withExistingVirtualHub(String resourceGroupName, String virtualHubName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualHubName = virtualHubName;
        return this;
    }

    @Override
    public HubVirtualNetworkConnectionImpl withAllowHubToRemoteVnetTransit(Boolean allowHubToRemoteVnetTransit) {
        this.inner().withAllowHubToRemoteVnetTransit(allowHubToRemoteVnetTransit);
        return this;
    }

    @Override
    public HubVirtualNetworkConnectionImpl withAllowRemoteVnetToUseHubVnetGateways(Boolean allowRemoteVnetToUseHubVnetGateways) {
        this.inner().withAllowRemoteVnetToUseHubVnetGateways(allowRemoteVnetToUseHubVnetGateways);
        return this;
    }

    @Override
    public HubVirtualNetworkConnectionImpl withEnableInternetSecurity(Boolean enableInternetSecurity) {
        this.inner().withEnableInternetSecurity(enableInternetSecurity);
        return this;
    }

    @Override
    public HubVirtualNetworkConnectionImpl withId(String id) {
        this.inner().withId(id);
        return this;
    }

    @Override
    public HubVirtualNetworkConnectionImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public HubVirtualNetworkConnectionImpl withRemoteVirtualNetwork(SubResource remoteVirtualNetwork) {
        this.inner().withRemoteVirtualNetwork(remoteVirtualNetwork);
        return this;
    }

    @Override
    public HubVirtualNetworkConnectionImpl withRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        this.inner().withRoutingConfiguration(routingConfiguration);
        return this;
    }

}
