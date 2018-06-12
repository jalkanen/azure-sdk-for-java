/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ContentModeratorClient;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ImageModerations;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementImageLists;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementImages;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementTermLists;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementTerms;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AzureRegionBaseUrl;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.Reviews;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.TextModerations;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the ContentModeratorClientImpl class.
 */
public class ContentModeratorClientImpl extends AzureServiceClient implements ContentModeratorClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Supported Azure regions for Content Moderator endpoints. Possible values include: 'westus.api.cognitive.microsoft.com', 'westus2.api.cognitive.microsoft.com', 'eastus.api.cognitive.microsoft.com', 'eastus2.api.cognitive.microsoft.com', 'westcentralus.api.cognitive.microsoft.com', 'southcentralus.api.cognitive.microsoft.com', 'westeurope.api.cognitive.microsoft.com', 'northeurope.api.cognitive.microsoft.com', 'southeastasia.api.cognitive.microsoft.com', 'eastasia.api.cognitive.microsoft.com', 'australiaeast.api.cognitive.microsoft.com', 'brazilsouth.api.cognitive.microsoft.com', 'contentmoderatortest.azure-api.net'. */
    private AzureRegionBaseUrl baseUrl;

    /**
     * Gets Supported Azure regions for Content Moderator endpoints. Possible values include: 'westus.api.cognitive.microsoft.com', 'westus2.api.cognitive.microsoft.com', 'eastus.api.cognitive.microsoft.com', 'eastus2.api.cognitive.microsoft.com', 'westcentralus.api.cognitive.microsoft.com', 'southcentralus.api.cognitive.microsoft.com', 'westeurope.api.cognitive.microsoft.com', 'northeurope.api.cognitive.microsoft.com', 'southeastasia.api.cognitive.microsoft.com', 'eastasia.api.cognitive.microsoft.com', 'australiaeast.api.cognitive.microsoft.com', 'brazilsouth.api.cognitive.microsoft.com', 'contentmoderatortest.azure-api.net'.
     *
     * @return the baseUrl value.
     */
    public AzureRegionBaseUrl baseUrl() {
        return this.baseUrl;
    }

    /**
     * Sets Supported Azure regions for Content Moderator endpoints. Possible values include: 'westus.api.cognitive.microsoft.com', 'westus2.api.cognitive.microsoft.com', 'eastus.api.cognitive.microsoft.com', 'eastus2.api.cognitive.microsoft.com', 'westcentralus.api.cognitive.microsoft.com', 'southcentralus.api.cognitive.microsoft.com', 'westeurope.api.cognitive.microsoft.com', 'northeurope.api.cognitive.microsoft.com', 'southeastasia.api.cognitive.microsoft.com', 'eastasia.api.cognitive.microsoft.com', 'australiaeast.api.cognitive.microsoft.com', 'brazilsouth.api.cognitive.microsoft.com', 'contentmoderatortest.azure-api.net'.
     *
     * @param baseUrl the baseUrl value.
     * @return the service client itself
     */
    public ContentModeratorClientImpl withBaseUrl(AzureRegionBaseUrl baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public ContentModeratorClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public ContentModeratorClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public ContentModeratorClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ImageModerations object to access its operations.
     */
    private ImageModerations imageModerations;

    /**
     * Gets the ImageModerations object to access its operations.
     * @return the ImageModerations object.
     */
    public ImageModerations imageModerations() {
        return this.imageModerations;
    }

    /**
     * The TextModerations object to access its operations.
     */
    private TextModerations textModerations;

    /**
     * Gets the TextModerations object to access its operations.
     * @return the TextModerations object.
     */
    public TextModerations textModerations() {
        return this.textModerations;
    }

    /**
     * The ListManagementImageLists object to access its operations.
     */
    private ListManagementImageLists listManagementImageLists;

    /**
     * Gets the ListManagementImageLists object to access its operations.
     * @return the ListManagementImageLists object.
     */
    public ListManagementImageLists listManagementImageLists() {
        return this.listManagementImageLists;
    }

    /**
     * The ListManagementTermLists object to access its operations.
     */
    private ListManagementTermLists listManagementTermLists;

    /**
     * Gets the ListManagementTermLists object to access its operations.
     * @return the ListManagementTermLists object.
     */
    public ListManagementTermLists listManagementTermLists() {
        return this.listManagementTermLists;
    }

    /**
     * The ListManagementImages object to access its operations.
     */
    private ListManagementImages listManagementImages;

    /**
     * Gets the ListManagementImages object to access its operations.
     * @return the ListManagementImages object.
     */
    public ListManagementImages listManagementImages() {
        return this.listManagementImages;
    }

    /**
     * The ListManagementTerms object to access its operations.
     */
    private ListManagementTerms listManagementTerms;

    /**
     * Gets the ListManagementTerms object to access its operations.
     * @return the ListManagementTerms object.
     */
    public ListManagementTerms listManagementTerms() {
        return this.listManagementTerms;
    }

    /**
     * The Reviews object to access its operations.
     */
    private Reviews reviews;

    /**
     * Gets the Reviews object to access its operations.
     * @return the Reviews object.
     */
    public Reviews reviews() {
        return this.reviews;
    }

    /**
     * Initializes an instance of ContentModeratorClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public ContentModeratorClientImpl(ServiceClientCredentials credentials) {
        this("https://{baseUrl}", credentials);
    }

    /**
     * Initializes an instance of ContentModeratorClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public ContentModeratorClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of ContentModeratorClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public ContentModeratorClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.imageModerations = new ImageModerationsImpl(restClient().retrofit(), this);
        this.textModerations = new TextModerationsImpl(restClient().retrofit(), this);
        this.listManagementImageLists = new ListManagementImageListsImpl(restClient().retrofit(), this);
        this.listManagementTermLists = new ListManagementTermListsImpl(restClient().retrofit(), this);
        this.listManagementImages = new ListManagementImagesImpl(restClient().retrofit(), this);
        this.listManagementTerms = new ListManagementTermsImpl(restClient().retrofit(), this);
        this.reviews = new ReviewsImpl(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "ContentModeratorClient", "1.0");
    }
}
