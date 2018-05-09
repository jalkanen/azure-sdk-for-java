/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Skus;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Usages;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.ResourceSkus;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Operations;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Locations;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Accounts;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure CognitiveServices resource management.
 */
public final class CognitiveServicesManager extends ManagerCore<CognitiveServicesManager, CognitiveServicesManagementClientImpl> {
    private Skus skus;
    private Usages usages;
    private ResourceSkus resourceSkus;
    private Operations operations;
    private Locations locations;
    private Accounts accounts;
    /**
    * Get a Configurable instance that can be used to create CognitiveServicesManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new CognitiveServicesManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of CognitiveServicesManager that exposes CognitiveServices resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the CognitiveServicesManager
    */
    public static CognitiveServicesManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new CognitiveServicesManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of CognitiveServicesManager that exposes CognitiveServices resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the CognitiveServicesManager
    */
    public static CognitiveServicesManager authenticate(RestClient restClient, String subscriptionId) {
        return new CognitiveServicesManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of CognitiveServicesManager that exposes CognitiveServices management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing CognitiveServices management API entry points that work across subscriptions
        */
        CognitiveServicesManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Skus.
     */
    public Skus skus() {
        if (this.skus == null) {
            this.skus = new SkusImpl(this);
        }
        return this.skus;
    }

    /**
     * @return Entry point to manage Usages.
     */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(this);
        }
        return this.usages;
    }

    /**
     * @return Entry point to manage ResourceSkus.
     */
    public ResourceSkus resourceSkus() {
        if (this.resourceSkus == null) {
            this.resourceSkus = new ResourceSkusImpl(this);
        }
        return this.resourceSkus;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Locations.
     */
    public Locations locations() {
        if (this.locations == null) {
            this.locations = new LocationsImpl(this);
        }
        return this.locations;
    }

    /**
     * @return Entry point to manage Accounts.
     */
    public Accounts accounts() {
        if (this.accounts == null) {
            this.accounts = new AccountsImpl(this);
        }
        return this.accounts;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public CognitiveServicesManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return CognitiveServicesManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private CognitiveServicesManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new CognitiveServicesManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
