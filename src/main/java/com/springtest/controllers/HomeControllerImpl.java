package com.springtest.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControllerImpl implements  HomeController {

    @GetMapping(path="/")
    public String index(){
        return "Hello World";
    }

    @GetMapping(path="/hello")
    @ApiOperation("Test Path to test setup - returns 'Hello'")
    public String hello(){
        return "Hello";
    }
}
