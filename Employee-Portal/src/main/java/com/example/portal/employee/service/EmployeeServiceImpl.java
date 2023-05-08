package com.example.portal.employee.service;

import com.example.portal.employee.DTO.EmployeeDTO;
import com.example.portal.employee.DTO.EmployeeSaveDTO;
import com.example.portal.employee.DTO.EmployeeUpdateDTO;
import com.example.portal.employee.entity.EmployeeRepo;
import com.example.portal.employee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public String addEmployee(EmployeeSaveDTO employeeSaveDTO)
    {
        Employee employee = new Employee(
                employeeSaveDTO.getEmployeeName(),
                employeeSaveDTO.getEmployeeAddress(),
                employeeSaveDTO.getEmployeeMobile(),
                employeeSaveDTO.getEmployeeSkills(),
                employeeSaveDTO.getEmployeeHobbies()
        );
        employeeRepo.save(employee);
        return employee.getEmployeeName();
    }

    @Override
    public List<EmployeeDTO> getAllEmployee() {
        List<Employee> getEmployees = employeeRepo.findAll();
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        for(Employee e:getEmployees)
        {
            EmployeeDTO employeeDTO = new EmployeeDTO(

                    e.getEmployeeId(),
                    e.getEmployeeName(),
                    e.getEmployeeAddress(),
                    e.getEmployeeMobile(),
                    e.getEmployeeSkills(),
                    e.getEmployeeHobbies()
            );
            employeeDTOList.add(employeeDTO);
        }

        return  employeeDTOList;
    }

    @Override
    public String updateEmployee(EmployeeUpdateDTO employeeUpdateDTO)
    {
        if (employeeRepo.existsById(employeeUpdateDTO.getEmployeeId())) {
            Employee employee = employeeRepo.getById(employeeUpdateDTO.getEmployeeId());

            employee.setEmployeeName(employeeUpdateDTO.getEmployeeName());
            employee.setEmployeeAddress(employeeUpdateDTO.getEmployeeAddress());
            employee.setEmployeeMobile(employeeUpdateDTO.getEmployeeMobile());
            employee.setEmployeeSkills(employeeUpdateDTO.getEmployeeSkills());
            employee.setEmployeeHobbies(employeeUpdateDTO.getEmployeeHobbies());
            employeeRepo.save(employee);
        }
        else
        {
            System.out.println("This Employee Id does not exists.");
        }

        return null;
    }

    @Override
    public boolean deleteEmployee(int id) {

        if(employeeRepo.existsById(id))
        {
            employeeRepo.deleteById(id);
        }
        else
        {
            System.out.println("Employee id not found.");
        }

        return true;
    }
}
