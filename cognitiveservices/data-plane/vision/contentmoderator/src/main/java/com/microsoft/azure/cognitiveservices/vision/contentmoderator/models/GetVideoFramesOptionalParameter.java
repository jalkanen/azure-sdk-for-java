/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The GetVideoFramesOptionalParameter model.
 */
public class GetVideoFramesOptionalParameter {
    /**
     * Time stamp of the frame from where you want to start fetching the
     * frames.
     */
    private Integer startSeed;

    /**
     * Number of frames to fetch.
     */
    private Integer noOfRecords;

    /**
     * Get frames filtered by tags.
     */
    private String filter;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the startSeed value.
     *
     * @return the startSeed value
     */
    public Integer startSeed() {
        return this.startSeed;
    }

    /**
     * Set the startSeed value.
     *
     * @param startSeed the startSeed value to set
     * @return the GetVideoFramesOptionalParameter object itself.
     */
    public GetVideoFramesOptionalParameter withStartSeed(Integer startSeed) {
        this.startSeed = startSeed;
        return this;
    }

    /**
     * Get the noOfRecords value.
     *
     * @return the noOfRecords value
     */
    public Integer noOfRecords() {
        return this.noOfRecords;
    }

    /**
     * Set the noOfRecords value.
     *
     * @param noOfRecords the noOfRecords value to set
     * @return the GetVideoFramesOptionalParameter object itself.
     */
    public GetVideoFramesOptionalParameter withNoOfRecords(Integer noOfRecords) {
        this.noOfRecords = noOfRecords;
        return this;
    }

    /**
     * Get the filter value.
     *
     * @return the filter value
     */
    public String filter() {
        return this.filter;
    }

    /**
     * Set the filter value.
     *
     * @param filter the filter value to set
     * @return the GetVideoFramesOptionalParameter object itself.
     */
    public GetVideoFramesOptionalParameter withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the GetVideoFramesOptionalParameter object itself.
     */
    public GetVideoFramesOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
