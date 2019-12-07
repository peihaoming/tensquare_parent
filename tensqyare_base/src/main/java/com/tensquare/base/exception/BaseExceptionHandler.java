package com.tensquare.base.exception;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author haomingp
 * @Description: TODO
 * @date 2019/12/7 16:04
 */
@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result exception(Exception e){
        e.printStackTrace();
        return new Result( StatusCode.ERROR,e.getMessage(),false);
    }

}
