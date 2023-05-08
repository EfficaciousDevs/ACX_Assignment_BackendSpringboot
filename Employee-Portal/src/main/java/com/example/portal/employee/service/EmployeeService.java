package com.example.portal.employee.service;

import com.example.portal.employee.DTO.EmployeeDTO;
import com.example.portal.employee.DTO.EmployeeSaveDTO;
import com.example.portal.employee.DTO.EmployeeUpdateDTO;

import java.util.List;

public interface EmployeeService {
        String addEmployee(EmployeeSaveDTO employeeSaveDTO);

        List<EmployeeDTO> getAllEmployee();

        String updateEmployee(EmployeeUpdateDTO employeeUpdateDTO);

        boolean deleteEmployee(int id);

}
