/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.servicefabric.FabricErrorException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in MeshSecrets.
 */
public class MeshSecretsInner {
    /** The Retrofit service to perform REST calls. */
    private MeshSecretsService service;
    /** The service client containing this operation class. */
    private ServiceFabricClientAPIsImpl client;

    /**
     * Initializes an instance of MeshSecretsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MeshSecretsInner(Retrofit retrofit, ServiceFabricClientAPIsImpl client) {
        this.service = retrofit.create(MeshSecretsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MeshSecrets to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MeshSecretsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.servicefabric.MeshSecrets createOrUpdate" })
        @PUT("Resources/Secrets/{secretResourceName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path(value = "secretResourceName", encoded = true) String secretResourceName, @Query("api-version") String apiVersion, @Body SecretResourceDescriptionInner secretResourceDescription, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.servicefabric.MeshSecrets get" })
        @GET("Resources/Secrets/{secretResourceName}")
        Observable<Response<ResponseBody>> get(@Path(value = "secretResourceName", encoded = true) String secretResourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.servicefabric.MeshSecrets delete" })
        @HTTP(path = "Resources/Secrets/{secretResourceName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path(value = "secretResourceName", encoded = true) String secretResourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.servicefabric.MeshSecrets list" })
        @GET("Resources/Secrets")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Creates or updates a Secret resource.
     * Creates a Secret resource with the specified name, description and properties. If Secret resource with the same name exists, then it is updated with the specified description and properties. Once created, the kind and contentType of a secret resource cannot be updated.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretResourceDescription Description for creating a secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws FabricErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SecretResourceDescriptionInner object if successful.
     */
    public SecretResourceDescriptionInner createOrUpdate(String secretResourceName, SecretResourceDescriptionInner secretResourceDescription) {
        return createOrUpdateWithServiceResponseAsync(secretResourceName, secretResourceDescription).toBlocking().single().body();
    }

    /**
     * Creates or updates a Secret resource.
     * Creates a Secret resource with the specified name, description and properties. If Secret resource with the same name exists, then it is updated with the specified description and properties. Once created, the kind and contentType of a secret resource cannot be updated.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretResourceDescription Description for creating a secret resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SecretResourceDescriptionInner> createOrUpdateAsync(String secretResourceName, SecretResourceDescriptionInner secretResourceDescription, final ServiceCallback<SecretResourceDescriptionInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(secretResourceName, secretResourceDescription), serviceCallback);
    }

    /**
     * Creates or updates a Secret resource.
     * Creates a Secret resource with the specified name, description and properties. If Secret resource with the same name exists, then it is updated with the specified description and properties. Once created, the kind and contentType of a secret resource cannot be updated.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretResourceDescription Description for creating a secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecretResourceDescriptionInner object
     */
    public Observable<SecretResourceDescriptionInner> createOrUpdateAsync(String secretResourceName, SecretResourceDescriptionInner secretResourceDescription) {
        return createOrUpdateWithServiceResponseAsync(secretResourceName, secretResourceDescription).map(new Func1<ServiceResponse<SecretResourceDescriptionInner>, SecretResourceDescriptionInner>() {
            @Override
            public SecretResourceDescriptionInner call(ServiceResponse<SecretResourceDescriptionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a Secret resource.
     * Creates a Secret resource with the specified name, description and properties. If Secret resource with the same name exists, then it is updated with the specified description and properties. Once created, the kind and contentType of a secret resource cannot be updated.
     *
     * @param secretResourceName The name of the secret resource.
     * @param secretResourceDescription Description for creating a secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecretResourceDescriptionInner object
     */
    public Observable<ServiceResponse<SecretResourceDescriptionInner>> createOrUpdateWithServiceResponseAsync(String secretResourceName, SecretResourceDescriptionInner secretResourceDescription) {
        if (secretResourceName == null) {
            throw new IllegalArgumentException("Parameter secretResourceName is required and cannot be null.");
        }
        if (secretResourceDescription == null) {
            throw new IllegalArgumentException("Parameter secretResourceDescription is required and cannot be null.");
        }
        Validator.validate(secretResourceDescription);
        final String apiVersion = "6.4-preview";
        return service.createOrUpdate(secretResourceName, apiVersion, secretResourceDescription, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SecretResourceDescriptionInner>>>() {
                @Override
                public Observable<ServiceResponse<SecretResourceDescriptionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SecretResourceDescriptionInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SecretResourceDescriptionInner> createOrUpdateDelegate(Response<ResponseBody> response) throws FabricErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SecretResourceDescriptionInner, FabricErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SecretResourceDescriptionInner>() { }.getType())
                .register(201, new TypeToken<SecretResourceDescriptionInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(FabricErrorException.class)
                .build(response);
    }

    /**
     * Gets the Secret resource with the given name.
     * Gets the information about the Secret resource with the given name. The information include the description and other properties of the Secret.
     *
     * @param secretResourceName The name of the secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws FabricErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SecretResourceDescriptionInner object if successful.
     */
    public SecretResourceDescriptionInner get(String secretResourceName) {
        return getWithServiceResponseAsync(secretResourceName).toBlocking().single().body();
    }

    /**
     * Gets the Secret resource with the given name.
     * Gets the information about the Secret resource with the given name. The information include the description and other properties of the Secret.
     *
     * @param secretResourceName The name of the secret resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SecretResourceDescriptionInner> getAsync(String secretResourceName, final ServiceCallback<SecretResourceDescriptionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(secretResourceName), serviceCallback);
    }

    /**
     * Gets the Secret resource with the given name.
     * Gets the information about the Secret resource with the given name. The information include the description and other properties of the Secret.
     *
     * @param secretResourceName The name of the secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecretResourceDescriptionInner object
     */
    public Observable<SecretResourceDescriptionInner> getAsync(String secretResourceName) {
        return getWithServiceResponseAsync(secretResourceName).map(new Func1<ServiceResponse<SecretResourceDescriptionInner>, SecretResourceDescriptionInner>() {
            @Override
            public SecretResourceDescriptionInner call(ServiceResponse<SecretResourceDescriptionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the Secret resource with the given name.
     * Gets the information about the Secret resource with the given name. The information include the description and other properties of the Secret.
     *
     * @param secretResourceName The name of the secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SecretResourceDescriptionInner object
     */
    public Observable<ServiceResponse<SecretResourceDescriptionInner>> getWithServiceResponseAsync(String secretResourceName) {
        if (secretResourceName == null) {
            throw new IllegalArgumentException("Parameter secretResourceName is required and cannot be null.");
        }
        final String apiVersion = "6.4-preview";
        return service.get(secretResourceName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SecretResourceDescriptionInner>>>() {
                @Override
                public Observable<ServiceResponse<SecretResourceDescriptionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SecretResourceDescriptionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SecretResourceDescriptionInner> getDelegate(Response<ResponseBody> response) throws FabricErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SecretResourceDescriptionInner, FabricErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SecretResourceDescriptionInner>() { }.getType())
                .registerError(FabricErrorException.class)
                .build(response);
    }

    /**
     * Deletes the Secret resource.
     * Deletes the specified Secret resource and all of its named values.
     *
     * @param secretResourceName The name of the secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws FabricErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String secretResourceName) {
        deleteWithServiceResponseAsync(secretResourceName).toBlocking().single().body();
    }

    /**
     * Deletes the Secret resource.
     * Deletes the specified Secret resource and all of its named values.
     *
     * @param secretResourceName The name of the secret resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String secretResourceName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(secretResourceName), serviceCallback);
    }

    /**
     * Deletes the Secret resource.
     * Deletes the specified Secret resource and all of its named values.
     *
     * @param secretResourceName The name of the secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String secretResourceName) {
        return deleteWithServiceResponseAsync(secretResourceName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the Secret resource.
     * Deletes the specified Secret resource and all of its named values.
     *
     * @param secretResourceName The name of the secret resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String secretResourceName) {
        if (secretResourceName == null) {
            throw new IllegalArgumentException("Parameter secretResourceName is required and cannot be null.");
        }
        final String apiVersion = "6.4-preview";
        return service.delete(secretResourceName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws FabricErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, FabricErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(FabricErrorException.class)
                .build(response);
    }

    /**
     * Lists all the secret resources.
     * Gets the information about all secret resources in a given resource group. The information include the description and other properties of the Secret.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws FabricErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedSecretResourceDescriptionListInner object if successful.
     */
    public PagedSecretResourceDescriptionListInner list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Lists all the secret resources.
     * Gets the information about all secret resources in a given resource group. The information include the description and other properties of the Secret.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PagedSecretResourceDescriptionListInner> listAsync(final ServiceCallback<PagedSecretResourceDescriptionListInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Lists all the secret resources.
     * Gets the information about all secret resources in a given resource group. The information include the description and other properties of the Secret.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedSecretResourceDescriptionListInner object
     */
    public Observable<PagedSecretResourceDescriptionListInner> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<PagedSecretResourceDescriptionListInner>, PagedSecretResourceDescriptionListInner>() {
            @Override
            public PagedSecretResourceDescriptionListInner call(ServiceResponse<PagedSecretResourceDescriptionListInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all the secret resources.
     * Gets the information about all secret resources in a given resource group. The information include the description and other properties of the Secret.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedSecretResourceDescriptionListInner object
     */
    public Observable<ServiceResponse<PagedSecretResourceDescriptionListInner>> listWithServiceResponseAsync() {
        final String apiVersion = "6.4-preview";
        return service.list(apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PagedSecretResourceDescriptionListInner>>>() {
                @Override
                public Observable<ServiceResponse<PagedSecretResourceDescriptionListInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PagedSecretResourceDescriptionListInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PagedSecretResourceDescriptionListInner> listDelegate(Response<ResponseBody> response) throws FabricErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<PagedSecretResourceDescriptionListInner, FabricErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PagedSecretResourceDescriptionListInner>() { }.getType())
                .registerError(FabricErrorException.class)
                .build(response);
    }

}