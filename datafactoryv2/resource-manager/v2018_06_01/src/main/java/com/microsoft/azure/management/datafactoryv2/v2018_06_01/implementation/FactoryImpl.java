/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.Factory;
import rx.Observable;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.FactoryUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.FactoryIdentity;
import org.joda.time.DateTime;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.FactoryRepoConfiguration;
import rx.functions.Func1;

class FactoryImpl extends GroupableResourceCoreImpl<Factory, FactoryInner, FactoryImpl, DataFactoryManager> implements Factory, Factory.Definition, Factory.Update {
    private FactoryUpdateParameters updateParameter;
    FactoryImpl(String name, FactoryInner inner, DataFactoryManager manager) {
        super(name, inner, manager);
        this.updateParameter = new FactoryUpdateParameters();
    }

    @Override
    public Observable<Factory> createResourceAsync() {
        FactoriesInner client = this.manager().inner().factories();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<FactoryInner, FactoryInner>() {
               @Override
               public FactoryInner call(FactoryInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Factory> updateResourceAsync() {
        FactoriesInner client = this.manager().inner().factories();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<FactoryInner, FactoryInner>() {
               @Override
               public FactoryInner call(FactoryInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<FactoryInner> getInnerAsync() {
        FactoriesInner client = this.manager().inner().factories();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new FactoryUpdateParameters();
    }

    @Override
    public Map<String, Object> additionalProperties() {
        return this.inner().additionalProperties();
    }

    @Override
    public DateTime createTime() {
        return this.inner().createTime();
    }

    @Override
    public String eTag() {
        return this.inner().eTag();
    }

    @Override
    public FactoryIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public FactoryRepoConfiguration repoConfiguration() {
        return this.inner().repoConfiguration();
    }

    @Override
    public String version() {
        return this.inner().version();
    }

    @Override
    public FactoryImpl withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.inner().withAdditionalProperties(additionalProperties);
        return this;
    }

    @Override
    public FactoryImpl withRepoConfiguration(FactoryRepoConfiguration repoConfiguration) {
        this.inner().withRepoConfiguration(repoConfiguration);
        return this;
    }

    @Override
    public FactoryImpl withIdentity(FactoryIdentity identity) {
        if (isInCreateMode()) {
            this.inner().withIdentity(identity);
        } else {
            this.updateParameter.withIdentity(identity);
        }
        return this;
    }

}