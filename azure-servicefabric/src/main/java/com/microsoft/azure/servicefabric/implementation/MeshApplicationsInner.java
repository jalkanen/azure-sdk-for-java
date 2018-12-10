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
 * in MeshApplications.
 */
public class MeshApplicationsInner {
    /** The Retrofit service to perform REST calls. */
    private MeshApplicationsService service;
    /** The service client containing this operation class. */
    private ServiceFabricClientAPIsImpl client;

    /**
     * Initializes an instance of MeshApplicationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MeshApplicationsInner(Retrofit retrofit, ServiceFabricClientAPIsImpl client) {
        this.service = retrofit.create(MeshApplicationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MeshApplications to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MeshApplicationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.servicefabric.MeshApplications createOrUpdate" })
        @PUT("Resources/Applications/{applicationResourceName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path(value = "applicationResourceName", encoded = true) String applicationResourceName, @Query("api-version") String apiVersion, @Body ApplicationResourceDescriptionInner applicationResourceDescription, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.servicefabric.MeshApplications get" })
        @GET("Resources/Applications/{applicationResourceName}")
        Observable<Response<ResponseBody>> get(@Path(value = "applicationResourceName", encoded = true) String applicationResourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.servicefabric.MeshApplications delete" })
        @HTTP(path = "Resources/Applications/{applicationResourceName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path(value = "applicationResourceName", encoded = true) String applicationResourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.servicefabric.MeshApplications list" })
        @GET("Resources/Applications")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Creates or updates a Application resource.
     * Creates a Application resource with the specified name, description and properties. If Application resource with the same name exists, then it is updated with the specified description and properties.
     *
     * @param applicationResourceName The identity of the application.
     * @param applicationResourceDescription Description for creating a Application resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws FabricErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationResourceDescriptionInner object if successful.
     */
    public ApplicationResourceDescriptionInner createOrUpdate(String applicationResourceName, ApplicationResourceDescriptionInner applicationResourceDescription) {
        return createOrUpdateWithServiceResponseAsync(applicationResourceName, applicationResourceDescription).toBlocking().single().body();
    }

    /**
     * Creates or updates a Application resource.
     * Creates a Application resource with the specified name, description and properties. If Application resource with the same name exists, then it is updated with the specified description and properties.
     *
     * @param applicationResourceName The identity of the application.
     * @param applicationResourceDescription Description for creating a Application resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationResourceDescriptionInner> createOrUpdateAsync(String applicationResourceName, ApplicationResourceDescriptionInner applicationResourceDescription, final ServiceCallback<ApplicationResourceDescriptionInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(applicationResourceName, applicationResourceDescription), serviceCallback);
    }

    /**
     * Creates or updates a Application resource.
     * Creates a Application resource with the specified name, description and properties. If Application resource with the same name exists, then it is updated with the specified description and properties.
     *
     * @param applicationResourceName The identity of the application.
     * @param applicationResourceDescription Description for creating a Application resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationResourceDescriptionInner object
     */
    public Observable<ApplicationResourceDescriptionInner> createOrUpdateAsync(String applicationResourceName, ApplicationResourceDescriptionInner applicationResourceDescription) {
        return createOrUpdateWithServiceResponseAsync(applicationResourceName, applicationResourceDescription).map(new Func1<ServiceResponse<ApplicationResourceDescriptionInner>, ApplicationResourceDescriptionInner>() {
            @Override
            public ApplicationResourceDescriptionInner call(ServiceResponse<ApplicationResourceDescriptionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a Application resource.
     * Creates a Application resource with the specified name, description and properties. If Application resource with the same name exists, then it is updated with the specified description and properties.
     *
     * @param applicationResourceName The identity of the application.
     * @param applicationResourceDescription Description for creating a Application resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationResourceDescriptionInner object
     */
    public Observable<ServiceResponse<ApplicationResourceDescriptionInner>> createOrUpdateWithServiceResponseAsync(String applicationResourceName, ApplicationResourceDescriptionInner applicationResourceDescription) {
        if (applicationResourceName == null) {
            throw new IllegalArgumentException("Parameter applicationResourceName is required and cannot be null.");
        }
        if (applicationResourceDescription == null) {
            throw new IllegalArgumentException("Parameter applicationResourceDescription is required and cannot be null.");
        }
        Validator.validate(applicationResourceDescription);
        final String apiVersion = "6.4-preview";
        return service.createOrUpdate(applicationResourceName, apiVersion, applicationResourceDescription, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationResourceDescriptionInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationResourceDescriptionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationResourceDescriptionInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationResourceDescriptionInner> createOrUpdateDelegate(Response<ResponseBody> response) throws FabricErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplicationResourceDescriptionInner, FabricErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationResourceDescriptionInner>() { }.getType())
                .register(201, new TypeToken<ApplicationResourceDescriptionInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(FabricErrorException.class)
                .build(response);
    }

    /**
     * Gets the Application resource with the given name.
     * Gets the information about the Application resource with the given name. The information include the description and other properties of the Application.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws FabricErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationResourceDescriptionInner object if successful.
     */
    public ApplicationResourceDescriptionInner get(String applicationResourceName) {
        return getWithServiceResponseAsync(applicationResourceName).toBlocking().single().body();
    }

    /**
     * Gets the Application resource with the given name.
     * Gets the information about the Application resource with the given name. The information include the description and other properties of the Application.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ApplicationResourceDescriptionInner> getAsync(String applicationResourceName, final ServiceCallback<ApplicationResourceDescriptionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(applicationResourceName), serviceCallback);
    }

    /**
     * Gets the Application resource with the given name.
     * Gets the information about the Application resource with the given name. The information include the description and other properties of the Application.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationResourceDescriptionInner object
     */
    public Observable<ApplicationResourceDescriptionInner> getAsync(String applicationResourceName) {
        return getWithServiceResponseAsync(applicationResourceName).map(new Func1<ServiceResponse<ApplicationResourceDescriptionInner>, ApplicationResourceDescriptionInner>() {
            @Override
            public ApplicationResourceDescriptionInner call(ServiceResponse<ApplicationResourceDescriptionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the Application resource with the given name.
     * Gets the information about the Application resource with the given name. The information include the description and other properties of the Application.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationResourceDescriptionInner object
     */
    public Observable<ServiceResponse<ApplicationResourceDescriptionInner>> getWithServiceResponseAsync(String applicationResourceName) {
        if (applicationResourceName == null) {
            throw new IllegalArgumentException("Parameter applicationResourceName is required and cannot be null.");
        }
        final String apiVersion = "6.4-preview";
        return service.get(applicationResourceName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ApplicationResourceDescriptionInner>>>() {
                @Override
                public Observable<ServiceResponse<ApplicationResourceDescriptionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ApplicationResourceDescriptionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ApplicationResourceDescriptionInner> getDelegate(Response<ResponseBody> response) throws FabricErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ApplicationResourceDescriptionInner, FabricErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ApplicationResourceDescriptionInner>() { }.getType())
                .registerError(FabricErrorException.class)
                .build(response);
    }

    /**
     * Deletes the Application resource.
     * Deletes the Application resource identified by the name.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws FabricErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String applicationResourceName) {
        deleteWithServiceResponseAsync(applicationResourceName).toBlocking().single().body();
    }

    /**
     * Deletes the Application resource.
     * Deletes the Application resource identified by the name.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String applicationResourceName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(applicationResourceName), serviceCallback);
    }

    /**
     * Deletes the Application resource.
     * Deletes the Application resource identified by the name.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String applicationResourceName) {
        return deleteWithServiceResponseAsync(applicationResourceName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the Application resource.
     * Deletes the Application resource identified by the name.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String applicationResourceName) {
        if (applicationResourceName == null) {
            throw new IllegalArgumentException("Parameter applicationResourceName is required and cannot be null.");
        }
        final String apiVersion = "6.4-preview";
        return service.delete(applicationResourceName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
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
     * Lists all the application resources.
     * Gets the information about all application resources in a given resource group. The information include the description and other properties of the Application.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws FabricErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedApplicationResourceDescriptionListInner object if successful.
     */
    public PagedApplicationResourceDescriptionListInner list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Lists all the application resources.
     * Gets the information about all application resources in a given resource group. The information include the description and other properties of the Application.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PagedApplicationResourceDescriptionListInner> listAsync(final ServiceCallback<PagedApplicationResourceDescriptionListInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Lists all the application resources.
     * Gets the information about all application resources in a given resource group. The information include the description and other properties of the Application.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedApplicationResourceDescriptionListInner object
     */
    public Observable<PagedApplicationResourceDescriptionListInner> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<PagedApplicationResourceDescriptionListInner>, PagedApplicationResourceDescriptionListInner>() {
            @Override
            public PagedApplicationResourceDescriptionListInner call(ServiceResponse<PagedApplicationResourceDescriptionListInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all the application resources.
     * Gets the information about all application resources in a given resource group. The information include the description and other properties of the Application.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedApplicationResourceDescriptionListInner object
     */
    public Observable<ServiceResponse<PagedApplicationResourceDescriptionListInner>> listWithServiceResponseAsync() {
        final String apiVersion = "6.4-preview";
        return service.list(apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PagedApplicationResourceDescriptionListInner>>>() {
                @Override
                public Observable<ServiceResponse<PagedApplicationResourceDescriptionListInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PagedApplicationResourceDescriptionListInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PagedApplicationResourceDescriptionListInner> listDelegate(Response<ResponseBody> response) throws FabricErrorException, IOException {
        return this.client.restClient().responseBuilderFactory().<PagedApplicationResourceDescriptionListInner, FabricErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PagedApplicationResourceDescriptionListInner>() { }.getType())
                .registerError(FabricErrorException.class)
                .build(response);
    }

}