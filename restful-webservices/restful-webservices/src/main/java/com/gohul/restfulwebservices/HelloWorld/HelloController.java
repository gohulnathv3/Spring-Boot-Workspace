package com.gohul.restfulwebservices.HelloWorld;

import com.gohul.restfulwebservices.HelloWorld.HelloWorldBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {
    // GET
    // URI - // hello-world
    // method - "Hello World"

    @Autowired
    private MessageSource messageSource;

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

    @GetMapping("/hello-world-internationalized")
    public String helloWorldInternationalized(@RequestHeader(name = "Accept-Language", required = false) Locale locale){
        return messageSource.getMessage("good.morning.message",null,"Default Message",locale);
        // en = Hello World
        // nl = Goede Morgen
        // fr = Bonjour

    }
}
