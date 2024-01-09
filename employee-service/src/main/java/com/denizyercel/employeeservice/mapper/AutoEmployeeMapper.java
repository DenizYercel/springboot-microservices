package com.denizyercel.employeeservice.mapper;

import com.denizyercel.employeeservice.dto.EmployeeDto;
import com.denizyercel.employeeservice.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoEmployeeMapper {

    AutoEmployeeMapper MAPPER = Mappers.getMapper(AutoEmployeeMapper.class);
    EmployeeDto maptoEmployeeDto(Employee employee);
    Employee maptoEmployee(EmployeeDto employeeDto);
}
