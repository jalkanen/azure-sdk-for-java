/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.devspaces.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.devspaces.v2018_06_01_preview.Controllers;
import com.microsoft.azure.management.devspaces.v2018_06_01_preview.Controller;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devspaces.v2018_06_01_preview.ControllerConnectionDetailsList;

class ControllersImpl extends GroupableResourcesCoreImpl<Controller, ControllerImpl, ControllerInner, ControllersInner, DevSpacesManager>  implements Controllers {
    protected ControllersImpl(DevSpacesManager manager) {
        super(manager.inner().controllers(), manager);
    }

    @Override
    protected Observable<ControllerInner> getInnerAsync(String resourceGroupName, String name) {
        ControllersInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ControllersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Controller> listByResourceGroup(String resourceGroupName) {
        ControllersInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Controller> listByResourceGroupAsync(String resourceGroupName) {
        ControllersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ControllerInner>, Iterable<ControllerInner>>() {
            @Override
            public Iterable<ControllerInner> call(Page<ControllerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ControllerInner, Controller>() {
            @Override
            public Controller call(ControllerInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Controller> list() {
        ControllersInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Controller> listAsync() {
        ControllersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ControllerInner>, Iterable<ControllerInner>>() {
            @Override
            public Iterable<ControllerInner> call(Page<ControllerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ControllerInner, Controller>() {
            @Override
            public Controller call(ControllerInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ControllerImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<ControllerConnectionDetailsList> listConnectionDetailsAsync(String resourceGroupName, String name) {
        ControllersInner client = this.inner();
        return client.listConnectionDetailsAsync(resourceGroupName, name)
        .map(new Func1<ControllerConnectionDetailsListInner, ControllerConnectionDetailsList>() {
            @Override
            public ControllerConnectionDetailsList call(ControllerConnectionDetailsListInner inner) {
                return new ControllerConnectionDetailsListImpl(inner, manager());
            }
        });
    }

    @Override
    protected ControllerImpl wrapModel(ControllerInner inner) {
        return  new ControllerImpl(inner.name(), inner, manager());
    }

    @Override
    protected ControllerImpl wrapModel(String name) {
        return new ControllerImpl(name, new ControllerInner(), this.manager());
    }

}
