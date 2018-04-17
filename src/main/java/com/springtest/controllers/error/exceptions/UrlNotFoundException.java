package com.springtest.controllers.error.exceptions;

public class UrlNotFoundException extends RuntimeException {

    public UrlNotFoundException(final String message) {
        super(message);
    }
}
