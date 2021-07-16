package com.castsoftware.aip.console.tools.core.dto.jobs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateApplicationJobRequest {
    private String appGuid;
    private String appName;
    private String domainName;
    private String cssGuid;
    private boolean inPlaceMode = false;
}
