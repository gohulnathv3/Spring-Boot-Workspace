package com.gohul.restfulwebservices.controller;

import com.gohul.restfulwebservices.service.HelloWorldBean;
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

    @GetMapping(value = "/hello-world-bean")
//    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }
}
