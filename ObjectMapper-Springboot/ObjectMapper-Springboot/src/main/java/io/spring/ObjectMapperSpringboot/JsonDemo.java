package io.spring.ObjectMapperSpringboot;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonDemo {
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = new Employee("Gohul", "Application Developer", "Hyderabad", "Information Technology");

       try {
//             // below line is used to convert object into JSON
//           objectMapper.writeValue(new File("D:\\Learnings\\Spring\\programs\\ObjectMapper-Springboot\\ObjectMapper-Springboot\\target\\emp.json"), employee);

//           // the below lines of codes are used to covert Json values into object.
//           String employeeJson = "{\"name\":\"Gohul\",\"designation\":\"Application Developer\",\"location\":\"Hyderabad\",\"department\":\"Information Technology\"}";
//           Employee emp = objectMapper.readValue(employeeJson, Employee.class);
//           System.out.println("Employee Name is "+ emp.getName());
//           System.out.println("Employee Location is "+emp.getLocation());
//           System.out.println("Employee Department is "+emp.getDepartment());
//           System.out.println("Employee Designation is "+emp.getDesignation());

           // JSON node, which is used to convert the json values into text.
           String employeeJson = "{\"name\":\"Gohul\",\"designation\":\"Application Developer\",\"location\":\"Hyderabad\",\"department\":\"Information Technology\"}";
           JsonNode jsonNode = objectMapper.readTree(employeeJson);

           String empName = jsonNode.get("name").asText();
//           String empDesignation = jsonNode.get("designation").asText();
           String empLocation = jsonNode.get("location").asText();
//           String empDepartment = jsonNode.get("Department").asText();

           objectMapper.writeValue(new File("D:\\Learnings\\Spring\\programs\\ObjectMapper-Springboot\\ObjectMapper-Springboot\\target\\empNameandLoc.txt"),
                   empName+","+empLocation );




       }catch (final Exception e){
           e.printStackTrace();
       }

    }
}
