/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Skus;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.CognitiveServicesAccountEnumerateSkusResult;

class SkusImpl extends WrapperImpl<AccountsInner> implements Skus {
    private final CognitiveServicesManager manager;

    SkusImpl(CognitiveServicesManager manager) {
        super(manager.inner().accounts());
        this.manager = manager;
    }

    public CognitiveServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CognitiveServicesAccountEnumerateSkusResult> listSkusAsync(String resourceGroupName, String accountName) {
        AccountsInner client = this.inner();
        return client.listSkusAsync(resourceGroupName, accountName)
        .map(new Func1<CognitiveServicesAccountEnumerateSkusResultInner, CognitiveServicesAccountEnumerateSkusResult>() {
            @Override
            public CognitiveServicesAccountEnumerateSkusResult call(CognitiveServicesAccountEnumerateSkusResultInner inner) {
                return new CognitiveServicesAccountEnumerateSkusResultImpl(inner, manager());
            }
        });
    }

}
