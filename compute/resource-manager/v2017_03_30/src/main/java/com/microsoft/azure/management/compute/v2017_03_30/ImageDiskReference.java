/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The source image used for creating the disk.
 */
public class ImageDiskReference {
    /**
     * A relative uri containing either a Platform Imgage Repository or user
     * image reference.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * If the disk is created from an image's data disk, this is an index that
     * indicates which of the data disks in the image to use. For OS disks,
     * this field is null.
     */
    @JsonProperty(value = "lun")
    private Integer lun;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ImageDiskReference object itself.
     */
    public ImageDiskReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the lun value.
     *
     * @return the lun value
     */
    public Integer lun() {
        return this.lun;
    }

    /**
     * Set the lun value.
     *
     * @param lun the lun value to set
     * @return the ImageDiskReference object itself.
     */
    public ImageDiskReference withLun(Integer lun) {
        this.lun = lun;
        return this;
    }

}
