package com.gohul.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // GET
    // URI - // hello-world
    // method - "Hello World"

    @GetMapping(value = "/hello-world")
//    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World";
    }
}
