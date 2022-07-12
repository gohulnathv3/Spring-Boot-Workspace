package com.springdemo.departmentservice.Repository;

import com.springdemo.departmentservice.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepartmentId(Long departmentId);
}
