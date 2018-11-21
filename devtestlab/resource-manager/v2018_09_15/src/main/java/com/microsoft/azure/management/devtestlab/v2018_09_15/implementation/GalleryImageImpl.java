/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15.implementation;

import com.microsoft.azure.management.devtestlab.v2018_09_15.GalleryImage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.devtestlab.v2018_09_15.GalleryImageReference;
import java.util.Map;

class GalleryImageImpl extends WrapperImpl<GalleryImageInner> implements GalleryImage {
    private final DevTestLabManager manager;

    GalleryImageImpl(GalleryImageInner inner,  DevTestLabManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevTestLabManager manager() {
        return this.manager;
    }



    @Override
    public String author() {
        return this.inner().author();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public Boolean enabled() {
        return this.inner().enabled();
    }

    @Override
    public String icon() {
        return this.inner().icon();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public GalleryImageReference imageReference() {
        return this.inner().imageReference();
    }

    @Override
    public Boolean isPlanAuthorized() {
        return this.inner().isPlanAuthorized();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String planId() {
        return this.inner().planId();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
