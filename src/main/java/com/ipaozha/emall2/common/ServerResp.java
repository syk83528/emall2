package com.ipaozha.emall2.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;


@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ServerResp<T> implements Serializable {
    private int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
    public T getData() {
        return data;
    }

    private ServerResp(int code) {
        this.code = code;
    }
    private ServerResp(int code,String msg) {
        this.code = code;
        this.msg = msg;
    }
    private ServerResp(String msg,T data) {
        this.msg = msg;
        this.data = data;
    }
    private ServerResp(int code,String msg,T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ServerResp<T> success() {
        return new ServerResp<T>(RespCode.success.getCode());
    }
    public static <T> ServerResp<T> successByMessage(String msg) {
        return new ServerResp<T>(RespCode.success.getCode(),RespCode.success.getMessage());
    }
    public static <T> ServerResp<T> success(T data) {
        return new ServerResp<T>(RespCode.success.getCode(),RespCode.success.getMessage(),data);
    }
    private static <T> ServerResp<T> success(String msg,T data) {
        return new ServerResp<T>(RespCode.success.getCode(),msg,data);
    }

    public static <T> ServerResp<T> error(){
        return new ServerResp<T>(RespCode.error.getCode(),RespCode.error.getMessage());
    }
    public static <T> ServerResp<T> errorByMessage(String errorMessage){
        return new ServerResp<T>(RespCode.error.getCode(),errorMessage);
    }
    public static <T> ServerResp<T> error(int errorCode,String errorMessage){
        return new ServerResp<T>(errorCode,errorMessage);
    }
}
