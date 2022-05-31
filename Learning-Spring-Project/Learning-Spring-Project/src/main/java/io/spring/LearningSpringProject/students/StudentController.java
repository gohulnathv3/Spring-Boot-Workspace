package io.spring.LearningSpringProject.students;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    // to get all students list

    @RequestMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    // to add student data

    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }



}
