package io.spring.LearningSpringProject.students;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    // to get all students list

    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }




}
