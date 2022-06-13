package io.spring.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// Needs to declare this is controller class
@RestController
public class HelloController {
    // Get, Post, Delete, Put - methods
    // URI - /users/{id}
    // Create method

//    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    // after some improvements
    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "Hello World";
    }

}
