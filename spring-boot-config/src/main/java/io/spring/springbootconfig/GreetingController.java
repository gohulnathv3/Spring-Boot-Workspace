package io.spring.springbootconfig;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    //Injecting value from property file
    @Value("${my.greetings: default value}")
    // Declaring member variable to restore the value from property file
    private String greetingMessage;

    @Value("some static message")
    private String staticMessage;


   @GetMapping("/greeting")
    public String greeting(){
//        return "Hello"; // Usual declaration
       return greetingMessage; // Returning values from property file

    }
}
