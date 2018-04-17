package com.springtest.controllers.error;

import com.springtest.controllers.error.exceptions.*;
import com.springtest.domain.ErrorInfo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(value = {UrlNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorInfo urlNotFound(Exception ex) {
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setStatus(404);
        errorInfo.setMessage(ex.getMessage());
        return errorInfo;
    }
}
