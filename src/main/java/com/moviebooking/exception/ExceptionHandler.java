package com.moviebooking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.BindException;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @org.springframework.web.bind.annotation.ExceptionHandler(CommonException.class)
    public Map<String,String> handleCustomerException(CommonException ex){
        Map<String,String> errorMap=new HashMap<>();
        errorMap.put("errorMessage", ex.getMessage());

        return errorMap;
    }


}
