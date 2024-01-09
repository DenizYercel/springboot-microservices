package com.denizyercel.departmentservice.repository;

import com.denizyercel.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByDepartmentCode(String departmentCode);
}
