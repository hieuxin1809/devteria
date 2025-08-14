package com.devteria.identity_service.exception;

import lombok.Data;

@Data
public class Appexception extends RuntimeException {

    public Appexception(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    private ErrorCode errorCode;
}
