/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.features.v2015_12_01.implementation;

import com.microsoft.azure.management.features.v2015_12_01.FeatureResult;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.features.v2015_12_01.FeatureProperties;

class FeatureResultImpl extends IndexableRefreshableWrapperImpl<FeatureResult, FeatureResultInner> implements FeatureResult {
    private final FeaturesManager manager;
    private String resourceProviderNamespace;
    private String featureName;

    FeatureResultImpl(FeatureResultInner inner,  FeaturesManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceProviderNamespace = IdParsingUtils.getValueFromIdByName(inner.id(), "providers");
        this.featureName = IdParsingUtils.getValueFromIdByName(inner.id(), "features");
    }

    @Override
    public FeaturesManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<FeatureResultInner> getInnerAsync() {
        FeaturesInner client = this.manager().inner().features();
        return client.getAsync(this.resourceProviderNamespace, this.featureName);
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
    public FeatureProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
