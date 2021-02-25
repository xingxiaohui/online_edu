package com.xxh.servicebase.exceptionhandler;

import com.xxh.commonutils.result.PageResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    //全部异常处理
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public PageResult handler(Exception e){
        return PageResult.error().massage("未知异常");
    }

    //自定义异常处理
    @ExceptionHandler(MyException.class)
    @ResponseBody
    public PageResult handler(MyException e){
        return PageResult.error().code(e.getCode()).massage(e.getMsg());
    }
}
