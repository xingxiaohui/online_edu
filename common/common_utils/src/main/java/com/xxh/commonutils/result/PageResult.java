package com.xxh.commonutils.result;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//统一返回结果类
@Data
public class PageResult {

    @ApiModelProperty("是否成功")
    private boolean success;

    @ApiModelProperty("返回码")
    private Integer code;

    @ApiModelProperty("返回信息")
    private String massage;

    @ApiModelProperty("结果集")
    private Map<String, Object> data = new HashMap<String, Object>();

    //私有化构造器
    private PageResult(){};

    public static PageResult success(){
        PageResult pageResult = new PageResult();
        pageResult.setSuccess(ResultCode.SUCCESS.isSuccess());
        pageResult.setCode(ResultCode.SUCCESS.getCode());
        pageResult.setMassage(ResultCode.SUCCESS.getMessage());
        return pageResult;
    }

    public static PageResult error(){
        PageResult pageResult = new PageResult();
        pageResult.setSuccess(ResultCode.UNKNOWN_ERROR.isSuccess());
        pageResult.setCode(ResultCode.UNKNOWN_ERROR.getCode());
        pageResult.setMassage(ResultCode.UNKNOWN_ERROR.getMessage());
        return pageResult;
    }

    //设定结果
    public static PageResult setResult(ResultCode resultCode){
        PageResult pageResult = new PageResult();
        pageResult.setSuccess(resultCode.isSuccess());
        pageResult.setCode(resultCode.getCode());
        pageResult.setMassage(resultCode.getMessage());
        return pageResult;
    }

    public PageResult success(boolean success) {
        this.success = success;
        return this;
    }

    public PageResult code(Integer code) {
        this.code = code;
        return this;
    }

    public PageResult massage(String massage) {
        this.massage = massage;
        return this;
    }

    public PageResult data(Map<String, Object> data) {
        this.data = data;
        return this;
    }

    public PageResult data(String name, Object value) {
        this.data.put(name, value);
        return  this;
    }
}
