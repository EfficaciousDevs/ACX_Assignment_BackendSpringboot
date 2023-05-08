package com.example.portal.employee.controller;

import com.example.portal.employee.DTO.EmployeeDTO;
import com.example.portal.employee.DTO.EmployeeSaveDTO;
import com.example.portal.employee.DTO.EmployeeUpdateDTO;
import com.example.portal.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeSaveDTO employeeSaveDTO)
    {
        String employee = employeeService.addEmployee(employeeSaveDTO);
        return "Employee " + employee + " has been added successfully.";
    }

    @GetMapping(path = "/getAllEmployee")
    public List<EmployeeDTO> getAllEmployee()
    {
        List<EmployeeDTO>allEmployees = employeeService.getAllEmployee();
        return allEmployees;
    }

    @PutMapping(path = "/update")
    public String updateEmployee(@RequestBody EmployeeUpdateDTO employeeUpdateDTO)
    {
        String employee = employeeService.updateEmployee(employeeUpdateDTO);
        return employee + " has been updated successfully.";
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteEmployee(@PathVariable(value = "id") int id)
    {
        boolean deleteEmployee = employeeService.deleteEmployee(id);
        return "Employee having { " + id + " } has been deleted successfully.";
    }

}
