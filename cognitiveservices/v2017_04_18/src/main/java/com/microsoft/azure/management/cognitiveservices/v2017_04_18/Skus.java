/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import rx.Observable;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation.AccountsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Skus.
 */
public interface Skus extends HasInner<AccountsInner> {
    /**
     * List available SKUs for the requested Cognitive Services account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param accountName The name of Cognitive Services account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CognitiveServicesAccountEnumerateSkusResult> listSkusAsync(String resourceGroupName, String accountName);

}
