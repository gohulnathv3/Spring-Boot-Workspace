package io.spring.LearningSpringProject.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Gohul", "Chennai", "9655666545"),
            new Student("Akash", "Bangalore", "7010182828")
    ));

    // to get all students
    List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    // to update student details
    public void updateStudent(Student student, String name){
        studentRepository.save(student);
    }

    // to delete data
    public void deleteStudent(String name){
        studentRepository.deleteById(name);
    }


}
