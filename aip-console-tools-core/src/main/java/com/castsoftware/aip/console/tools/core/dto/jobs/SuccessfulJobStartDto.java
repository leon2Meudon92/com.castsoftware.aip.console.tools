package com.castsoftware.aip.console.tools.core.dto.jobs;

/**
 * The structure of JSON message to be returned to the HTTP client
 */
public class SuccessfulJobStartDto {

    private String appGuid;
    private String jobGuid;
    private String jobUrl;
    private String guid;

    public SuccessfulJobStartDto() {
    }

    public SuccessfulJobStartDto(String guid) {
        this.guid = guid;
    }

    public SuccessfulJobStartDto(String appGuid, String jobGuid, String jobUrl) {
        this.appGuid = appGuid;
        this.jobGuid = jobGuid;
        this.jobUrl = jobUrl;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getAppGuid() {
        return appGuid;
    }

    public void setAppGuid(String appGuid) {
        this.appGuid = appGuid;
    }

    public String getJobGuid() {
        return jobGuid;
    }

    public void setJobGuid(String jobGuid) {
        this.jobGuid = jobGuid;
    }

    public String getJobUrl() {
        return jobUrl;
    }

    public void setJobUrl(String jobUrl) {
        this.jobUrl = jobUrl;
    }
}
