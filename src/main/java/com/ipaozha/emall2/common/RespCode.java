package com.ipaozha.emall2.common;

public enum RespCode {
    success(0,"success"),
    error(1,"error"),
    need_login(10,"need_login"),
    illegal_arguments(2,"illegal_arguments");


    private final Integer code;
    private final String message;

    RespCode(Integer code,String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
