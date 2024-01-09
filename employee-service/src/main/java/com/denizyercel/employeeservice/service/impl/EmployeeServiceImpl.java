package com.denizyercel.employeeservice.service.impl;

import com.denizyercel.employeeservice.dto.EmployeeDto;
import com.denizyercel.employeeservice.entity.Employee;
import com.denizyercel.employeeservice.mapper.AutoEmployeeMapper;
import com.denizyercel.employeeservice.repository.EmployeeRepository;
import com.denizyercel.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = AutoEmployeeMapper.MAPPER.maptoEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        EmployeeDto savedEmployeeDto = AutoEmployeeMapper.MAPPER.maptoEmployeeDto(savedEmployee);
        return  savedEmployeeDto;
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        return AutoEmployeeMapper.MAPPER.maptoEmployeeDto(employee);
    }
}
