package com.gohul.restfulwebservices.HelloWorld;

import com.gohul.restfulwebservices.HelloWorld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }


    //hello-world/path-variable/helloVariable
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello Variable, %s", name));
    }
}
