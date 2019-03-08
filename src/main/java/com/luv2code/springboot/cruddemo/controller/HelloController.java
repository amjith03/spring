package com.luv2code.springboot.cruddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Authorised";
    }
}