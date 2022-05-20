package io.spring.springbootconfig;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {



   @GetMapping("/greeting")
    public String greeting(){
        return "Hello"; // Usual declaration
//       return greetingMessage; // Returning values from property file

    }
}
