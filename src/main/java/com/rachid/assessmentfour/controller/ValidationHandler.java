package com.rachid.assessmentfour.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ValidationHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {

        Map<String, String> errors = new HashMap<>();

        String message = "[";
        for (ObjectError error : (ex.getBindingResult().getAllErrors())) {
            message = message +"\n"+ error.getDefaultMessage();
        }
        message = message  +"\n"+"]";

        errors.put("status", "ERROR");
        errors.put("errors", message);

        return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
    }

}
