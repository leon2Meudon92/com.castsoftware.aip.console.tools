package com.castsoftware.aip.console.tools.core.utils;

import lombok.Builder;
import lombok.Getter;

@Getter
public class EndPointRequest {
    private final String endPoint;
    private final Object request;
    @Builder
    public EndPointRequest(String endPoint, Object request){
        this.endPoint = endPoint;
        this.request = request;
    }
}
