/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.core.OperationStatusResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.compute.models.VirtualMachineVMImageCreateParameters;
import com.microsoft.windowsazure.management.compute.models.VirtualMachineVMImageGetDetailsResponse;
import com.microsoft.windowsazure.management.compute.models.VirtualMachineVMImageListResponse;
import com.microsoft.windowsazure.management.compute.models.VirtualMachineVMImageReplicateParameters;
import com.microsoft.windowsazure.management.compute.models.VirtualMachineVMImageReplicateResponse;
import com.microsoft.windowsazure.management.compute.models.VirtualMachineVMImageUpdateParameters;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
* The Service Management API includes operations for managing the virtual
* machine templates in your subscription.
*/
public interface VirtualMachineVMImageOperations {
    /**
    * The Create VM Image operation creates a VM image that in your image
    * repository.  (see
    * http://msdn.microsoft.com/en-us/library/azure/dn775054.aspx for more
    * information)
    *
    * @param parameters Required. Parameters supplied to the virtual machine VM
    * image create operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse beginCreating(VirtualMachineVMImageCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * The Create VM Image operation creates a VM image that in your image
    * repository.  (see
    * http://msdn.microsoft.com/en-us/library/azure/dn775054.aspx for more
    * information)
    *
    * @param parameters Required. Parameters supplied to the virtual machine VM
    * image create operation.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> beginCreatingAsync(VirtualMachineVMImageCreateParameters parameters);
    
    /**
    * The Begin Deleting Virtual Machine Image operation deletes the specified
    * virtual machine image.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * delete.
    * @param deleteFromStorage Required. Specifies that the source blob for the
    * image should also be deleted from storage.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse beginDeleting(String vmImageName, boolean deleteFromStorage) throws IOException, ServiceException;
    
    /**
    * The Begin Deleting Virtual Machine Image operation deletes the specified
    * virtual machine image.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * delete.
    * @param deleteFromStorage Required. Specifies that the source blob for the
    * image should also be deleted from storage.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> beginDeletingAsync(String vmImageName, boolean deleteFromStorage);
    
    /**
    * Share an already replicated VM image. This operation is only for
    * publishers. You have to be registered as image publisher with Windows
    * Azure to be able to call this.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * share.
    * @param permission Required. The sharing permission: public, msdn, or
    * private.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse beginSharing(String vmImageName, String permission) throws IOException, ServiceException;
    
    /**
    * Share an already replicated VM image. This operation is only for
    * publishers. You have to be registered as image publisher with Windows
    * Azure to be able to call this.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * share.
    * @param permission Required. The sharing permission: public, msdn, or
    * private.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> beginSharingAsync(String vmImageName, String permission);
    
    /**
    * Unreplicate an VM image to multiple target locations. This operation is
    * only for publishers. You have to be registered as image publisher with
    * Windows Azure to be able to call this. Note: The operation removes the
    * published copies of the user VM Image. It does not remove the actual
    * user VM Image. To remove the actual user VM Image, the publisher will
    * have to call Delete VM Image.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * replicate. Note: The VM Image Name should be the user VM Image, not the
    * published name of the VM Image.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse beginUnreplicating(String vmImageName) throws IOException, ServiceException;
    
    /**
    * Unreplicate an VM image to multiple target locations. This operation is
    * only for publishers. You have to be registered as image publisher with
    * Windows Azure to be able to call this. Note: The operation removes the
    * published copies of the user VM Image. It does not remove the actual
    * user VM Image. To remove the actual user VM Image, the publisher will
    * have to call Delete VM Image.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * replicate. Note: The VM Image Name should be the user VM Image, not the
    * published name of the VM Image.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> beginUnreplicatingAsync(String vmImageName);
    
    /**
    * The Create VM Image operation creates a VM image that in your image
    * repository.  (see
    * http://msdn.microsoft.com/en-us/library/azure/dn775054.aspx for more
    * information)
    *
    * @param parameters Required. Parameters supplied to the Create Virtual
    * Machine Image operation.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    OperationStatusResponse create(VirtualMachineVMImageCreateParameters parameters) throws InterruptedException, ExecutionException, ServiceException, IOException, ParserConfigurationException, SAXException, TransformerException, URISyntaxException;
    
    /**
    * The Create VM Image operation creates a VM image that in your image
    * repository.  (see
    * http://msdn.microsoft.com/en-us/library/azure/dn775054.aspx for more
    * information)
    *
    * @param parameters Required. Parameters supplied to the Create Virtual
    * Machine Image operation.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    Future<OperationStatusResponse> createAsync(VirtualMachineVMImageCreateParameters parameters);
    
    /**
    * The Delete Virtual Machine Image operation deletes the specified virtual
    * machine image.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * delete.
    * @param deleteFromStorage Required. Specifies that the source blob for the
    * image should also be deleted from storage.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    OperationStatusResponse delete(String vmImageName, boolean deleteFromStorage) throws IOException, ServiceException, InterruptedException, ExecutionException;
    
    /**
    * The Delete Virtual Machine Image operation deletes the specified virtual
    * machine image.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * delete.
    * @param deleteFromStorage Required. Specifies that the source blob for the
    * image should also be deleted from storage.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    Future<OperationStatusResponse> deleteAsync(String vmImageName, boolean deleteFromStorage);
    
    /**
    * Gets VMImage's properties and its replication details. This operation is
    * only for publishers. You have to be registered as image publisher with
    * Windows Azure to be able to call this.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * replicate.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The Get Details VM Images operation response.
    */
    VirtualMachineVMImageGetDetailsResponse getDetails(String vmImageName) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * Gets VMImage's properties and its replication details. This operation is
    * only for publishers. You have to be registered as image publisher with
    * Windows Azure to be able to call this.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * replicate.
    * @return The Get Details VM Images operation response.
    */
    Future<VirtualMachineVMImageGetDetailsResponse> getDetailsAsync(String vmImageName);
    
    /**
    * The List Virtual Machine Images operation retrieves a list of the virtual
    * machine images.
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The List VM Images operation response.
    */
    VirtualMachineVMImageListResponse list() throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * The List Virtual Machine Images operation retrieves a list of the virtual
    * machine images.
    *
    * @return The List VM Images operation response.
    */
    Future<VirtualMachineVMImageListResponse> listAsync();
    
    /**
    * Replicate an VM image to multiple target locations. This operation is
    * only for publishers. You have to be registered as image publisher with
    * Windows Azure to be able to call this.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * replicate.
    * @param parameters Required. Parameters supplied to the Replicate Virtual
    * Machine Image operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The response body contains the published name of the image.
    */
    VirtualMachineVMImageReplicateResponse replicate(String vmImageName, VirtualMachineVMImageReplicateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Replicate an VM image to multiple target locations. This operation is
    * only for publishers. You have to be registered as image publisher with
    * Windows Azure to be able to call this.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * replicate.
    * @param parameters Required. Parameters supplied to the Replicate Virtual
    * Machine Image operation.
    * @return The response body contains the published name of the image.
    */
    Future<VirtualMachineVMImageReplicateResponse> replicateAsync(String vmImageName, VirtualMachineVMImageReplicateParameters parameters);
    
    /**
    * Share an already replicated VM image. This operation is only for
    * publishers. You have to be registered as image publisher with Windows
    * Azure to be able to call this.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * share.
    * @param permission Required. The sharing permission: public, msdn, or
    * private.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    OperationStatusResponse share(String vmImageName, String permission) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * Share an already replicated VM image. This operation is only for
    * publishers. You have to be registered as image publisher with Windows
    * Azure to be able to call this.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * share.
    * @param permission Required. The sharing permission: public, msdn, or
    * private.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    Future<OperationStatusResponse> shareAsync(String vmImageName, String permission);
    
    /**
    * Unreplicate an VM image to multiple target locations. This operation is
    * only for publishers. You have to be registered as image publisher with
    * Windows Azure to be able to call this. Note: The operation removes the
    * published copies of the user VM Image. It does not remove the actual
    * user VM Image. To remove the actual user VM Image, the publisher will
    * have to call Delete VM Image.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * replicate. Note: The VM Image Name should be the user VM Image, not the
    * published name of the VM Image.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    OperationStatusResponse unreplicate(String vmImageName) throws InterruptedException, ExecutionException, ServiceException, IOException;
    
    /**
    * Unreplicate an VM image to multiple target locations. This operation is
    * only for publishers. You have to be registered as image publisher with
    * Windows Azure to be able to call this. Note: The operation removes the
    * published copies of the user VM Image. It does not remove the actual
    * user VM Image. To remove the actual user VM Image, the publisher will
    * have to call Delete VM Image.
    *
    * @param vmImageName Required. The name of the virtual machine image to
    * replicate. Note: The VM Image Name should be the user VM Image, not the
    * published name of the VM Image.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    Future<OperationStatusResponse> unreplicateAsync(String vmImageName);
    
    /**
    * The Update VM Image operation updates a VM image that in your image
    * repository.
    *
    * @param imageName Required. The name of the virtual machine image to be
    * updated.
    * @param parameters Required. Parameters supplied to the Update Virtual
    * Machine Image operation.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws ServiceException Thrown if the server returned an error for the
    * request.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse update(String imageName, VirtualMachineVMImageUpdateParameters parameters) throws InterruptedException, ExecutionException, ServiceException, IOException, ParserConfigurationException, SAXException, TransformerException, URISyntaxException;
    
    /**
    * The Update VM Image operation updates a VM image that in your image
    * repository.
    *
    * @param imageName Required. The name of the virtual machine image to be
    * updated.
    * @param parameters Required. Parameters supplied to the Update Virtual
    * Machine Image operation.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> updateAsync(String imageName, VirtualMachineVMImageUpdateParameters parameters);
}