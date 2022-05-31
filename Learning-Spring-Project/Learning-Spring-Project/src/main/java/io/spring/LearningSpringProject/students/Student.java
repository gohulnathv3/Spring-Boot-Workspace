package io.spring.LearningSpringProject.students;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("StudentRepo")
public class Student {

    @Id
    private String name;
    private String location;
    private String contactNum;

    public Student(){

    }


    public Student(String name, String location, String contactNum) {
        this.name = name;
        this.location = location;
        this.contactNum = contactNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
}
