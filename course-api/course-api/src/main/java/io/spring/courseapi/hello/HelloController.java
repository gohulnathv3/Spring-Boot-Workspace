package io.spring.courseapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//need to add the rest annotation to know this is controller class.
@RestController
//this becomes rest controller in spring.
//spring controller class
//this is used to make url and fetch the method to run
public class HelloController {

    //We need to request mapping to fetch the method by using below url.
    @RequestMapping("/hello")
    //add a method to run
    //if we call the above url, then below needs to be executed.
    //In default, get method is used in request mapping.
    public String sayHi(){
        return "Hi";
    }

}
