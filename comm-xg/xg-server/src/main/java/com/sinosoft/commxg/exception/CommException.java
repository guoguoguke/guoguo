package com.sinosoft.commxg.exception;

public class CommException extends RuntimeException{
    private Integer code;

    public CommException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public CommException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

