package com.springdemo.departmentservice.Service;

import com.springdemo.departmentservice.Entity.Department;
import com.springdemo.departmentservice.Repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service

public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(@RequestBody  Department department) {
        return departmentRepository.save(department);
    }
}
