package com.itkissi.studentManagement.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class StudentNotFoundAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(StudentNotFoundException.class)
    public Map<String,String> exceptionHandler(StudentNotFoundException exception)
    {
        Map<String,String> errorMap = new HashMap<>();
        errorMap.put("errorMessage",exception.getMessage());

        return errorMap;
    }

}