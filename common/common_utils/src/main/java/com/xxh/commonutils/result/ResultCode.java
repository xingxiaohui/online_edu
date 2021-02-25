package com.xxh.commonutils.result;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ResultCode {
    SUCCESS(true, 20000, "成功"),
    UNKNOWN_ERROR(false, 20001, "未知错误");
    private boolean success;
    private Integer code;
    private String message;
    ResultCode(boolean success, Integer code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
