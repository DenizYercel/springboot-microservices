package com.denizyercel.employeeservice.service;

import com.denizyercel.employeeservice.dto.APIResponseDto;
import com.denizyercel.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
