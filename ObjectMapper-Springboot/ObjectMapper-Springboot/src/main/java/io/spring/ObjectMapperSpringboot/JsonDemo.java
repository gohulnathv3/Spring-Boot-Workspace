package io.spring.ObjectMapperSpringboot;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonDemo {
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = new Employee("Gohul", "Application Developer", "Hyderabad", "Information Technology");

       try {
           objectMapper.writeValue(new File("D:\\Learnings\\Spring\\programs\\ObjectMapper-Springboot\\ObjectMapper-Springboot\\target\\emp.json"), employee);
       }catch (final Exception e){
           e.printStackTrace();
       }

    }
}
