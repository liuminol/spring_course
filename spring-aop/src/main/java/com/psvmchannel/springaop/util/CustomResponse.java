package com.psvmchannel.springaop.util;

import lombok.Data;

import java.util.Collection;

@Data
public class CustomResponse<T> {

    private int code;

    private String message;

    private Collection<T> responseList;

    public CustomResponse(Collection<T> response, CustomStatus customStatus) {
        this.code = customStatus.getCode();
        this.message = customStatus.getMessage();
        this.responseList = response;
    }
}
