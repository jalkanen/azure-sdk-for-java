/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.implementation;

import com.microsoft.azure.management.edgegateway.ShareStatus;
import com.microsoft.azure.management.edgegateway.MonitoringStatus;
import com.microsoft.azure.management.edgegateway.AzureContainerInfo;
import com.microsoft.azure.management.edgegateway.ShareAccessProtocol;
import java.util.List;
import com.microsoft.azure.management.edgegateway.UserAccessRight;
import com.microsoft.azure.management.edgegateway.ClientAccessRight;
import com.microsoft.azure.management.edgegateway.RefreshDetails;
import com.microsoft.azure.management.edgegateway.MountPointMap;
import com.microsoft.azure.management.edgegateway.DataPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.edgegateway.ARMBaseModel;

/**
 * Represents a share on the  Data Box Edge/Gateway device.
 */
@JsonFlatten
public class ShareInner extends ARMBaseModel {
    /**
     * Description for the share.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Current status of the share. Possible values include: 'Online',
     * 'Offline'.
     */
    @JsonProperty(value = "properties.shareStatus", required = true)
    private ShareStatus shareStatus;

    /**
     * Current monitoring status of the share. Possible values include:
     * 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.monitoringStatus", required = true)
    private MonitoringStatus monitoringStatus;

    /**
     * Azure container mapping for the share.
     */
    @JsonProperty(value = "properties.azureContainerInfo")
    private AzureContainerInfo azureContainerInfo;

    /**
     * Access protocol to be used by the share. Possible values include: 'SMB',
     * 'NFS'.
     */
    @JsonProperty(value = "properties.accessProtocol", required = true)
    private ShareAccessProtocol accessProtocol;

    /**
     * Mapping of Users and corresponding access rights on the share (mandatory
     * for SMB protocol).
     */
    @JsonProperty(value = "properties.userAccessRights")
    private List<UserAccessRight> userAccessRights;

    /**
     * List of IP addresses and corresponding access rights on the
     * share(mandatory for NFS protocol).
     */
    @JsonProperty(value = "properties.clientAccessRights")
    private List<ClientAccessRight> clientAccessRights;

    /**
     * Details of the refresh job on this share.
     */
    @JsonProperty(value = "properties.refreshDetails")
    private RefreshDetails refreshDetails;

    /**
     * Share mount point to the role.
     */
    @JsonProperty(value = "properties.shareMappings", access = JsonProperty.Access.WRITE_ONLY)
    private List<MountPointMap> shareMappings;

    /**
     * Data policy of the share. Possible values include: 'Cloud', 'Local'.
     */
    @JsonProperty(value = "properties.dataPolicy")
    private DataPolicy dataPolicy;

    /**
     * Get description for the share.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description for the share.
     *
     * @param description the description value to set
     * @return the ShareInner object itself.
     */
    public ShareInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get current status of the share. Possible values include: 'Online', 'Offline'.
     *
     * @return the shareStatus value
     */
    public ShareStatus shareStatus() {
        return this.shareStatus;
    }

    /**
     * Set current status of the share. Possible values include: 'Online', 'Offline'.
     *
     * @param shareStatus the shareStatus value to set
     * @return the ShareInner object itself.
     */
    public ShareInner withShareStatus(ShareStatus shareStatus) {
        this.shareStatus = shareStatus;
        return this;
    }

    /**
     * Get current monitoring status of the share. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the monitoringStatus value
     */
    public MonitoringStatus monitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * Set current monitoring status of the share. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param monitoringStatus the monitoringStatus value to set
     * @return the ShareInner object itself.
     */
    public ShareInner withMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.monitoringStatus = monitoringStatus;
        return this;
    }

    /**
     * Get azure container mapping for the share.
     *
     * @return the azureContainerInfo value
     */
    public AzureContainerInfo azureContainerInfo() {
        return this.azureContainerInfo;
    }

    /**
     * Set azure container mapping for the share.
     *
     * @param azureContainerInfo the azureContainerInfo value to set
     * @return the ShareInner object itself.
     */
    public ShareInner withAzureContainerInfo(AzureContainerInfo azureContainerInfo) {
        this.azureContainerInfo = azureContainerInfo;
        return this;
    }

    /**
     * Get access protocol to be used by the share. Possible values include: 'SMB', 'NFS'.
     *
     * @return the accessProtocol value
     */
    public ShareAccessProtocol accessProtocol() {
        return this.accessProtocol;
    }

    /**
     * Set access protocol to be used by the share. Possible values include: 'SMB', 'NFS'.
     *
     * @param accessProtocol the accessProtocol value to set
     * @return the ShareInner object itself.
     */
    public ShareInner withAccessProtocol(ShareAccessProtocol accessProtocol) {
        this.accessProtocol = accessProtocol;
        return this;
    }

    /**
     * Get mapping of Users and corresponding access rights on the share (mandatory for SMB protocol).
     *
     * @return the userAccessRights value
     */
    public List<UserAccessRight> userAccessRights() {
        return this.userAccessRights;
    }

    /**
     * Set mapping of Users and corresponding access rights on the share (mandatory for SMB protocol).
     *
     * @param userAccessRights the userAccessRights value to set
     * @return the ShareInner object itself.
     */
    public ShareInner withUserAccessRights(List<UserAccessRight> userAccessRights) {
        this.userAccessRights = userAccessRights;
        return this;
    }

    /**
     * Get list of IP addresses and corresponding access rights on the share(mandatory for NFS protocol).
     *
     * @return the clientAccessRights value
     */
    public List<ClientAccessRight> clientAccessRights() {
        return this.clientAccessRights;
    }

    /**
     * Set list of IP addresses and corresponding access rights on the share(mandatory for NFS protocol).
     *
     * @param clientAccessRights the clientAccessRights value to set
     * @return the ShareInner object itself.
     */
    public ShareInner withClientAccessRights(List<ClientAccessRight> clientAccessRights) {
        this.clientAccessRights = clientAccessRights;
        return this;
    }

    /**
     * Get details of the refresh job on this share.
     *
     * @return the refreshDetails value
     */
    public RefreshDetails refreshDetails() {
        return this.refreshDetails;
    }

    /**
     * Set details of the refresh job on this share.
     *
     * @param refreshDetails the refreshDetails value to set
     * @return the ShareInner object itself.
     */
    public ShareInner withRefreshDetails(RefreshDetails refreshDetails) {
        this.refreshDetails = refreshDetails;
        return this;
    }

    /**
     * Get share mount point to the role.
     *
     * @return the shareMappings value
     */
    public List<MountPointMap> shareMappings() {
        return this.shareMappings;
    }

    /**
     * Get data policy of the share. Possible values include: 'Cloud', 'Local'.
     *
     * @return the dataPolicy value
     */
    public DataPolicy dataPolicy() {
        return this.dataPolicy;
    }

    /**
     * Set data policy of the share. Possible values include: 'Cloud', 'Local'.
     *
     * @param dataPolicy the dataPolicy value to set
     * @return the ShareInner object itself.
     */
    public ShareInner withDataPolicy(DataPolicy dataPolicy) {
        this.dataPolicy = dataPolicy;
        return this;
    }

}
