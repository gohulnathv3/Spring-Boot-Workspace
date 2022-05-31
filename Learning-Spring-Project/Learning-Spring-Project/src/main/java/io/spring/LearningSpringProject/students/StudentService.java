package io.spring.LearningSpringProject.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    private List<Student> getAllStudents() {
        students.addAll(studentRepository.findAll());
        return students;
    }


}
