package io.spring.LearningSpringProject.students;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;


    // to get all students list

    @RequestMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    // to get student detail
    @GetMapping("/students/{name}")
    public Optional<Student> getStudent(@PathVariable String name){
        return studentRepository.findById(name);
    }


    // to add student data

    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Added student name is : "+student.getName();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/students/{name}")
    // to update student data
    public String updateStudent(@RequestBody Student student, @PathVariable String name){
        studentService.updateStudent(student,name);
        return "Student details updated successfully";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{name}")
    // to delete student data
    public String deleteStudent(@PathVariable String name){
        studentService.deleteStudent(name);
        return "Deleted successfully";
    }

}
