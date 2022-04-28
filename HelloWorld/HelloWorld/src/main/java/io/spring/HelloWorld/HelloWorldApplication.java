package io.spring.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@RequestMapping("/hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "World")String name){
		return String.format("Hello %s", name+"! Welcome to your first Spring Boot Application");
	}

}
