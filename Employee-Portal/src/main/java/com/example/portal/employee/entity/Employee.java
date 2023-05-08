package com.example.portal.employee.entity;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "employee_id", length = 8)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;

    @Column(name = "employee_name", length = 50)
    private String employeeName;

    @Column(name = "employee_address", length = 60)
    private String employeeAddress;

    @Column(name = "employee_mobile", length = 10)
    private int employeeMobile;

    @Column(name = "employee_skills", length = 30)
    private String employeeSkills;

    @Column(name = "employee_hobbies", length = 30)
    private String employeeHobbies;

    public Employee(String employeeName, String employeeAddress, int employeeMobile, String employeeSkills, String employeeHobbies) {
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeMobile = employeeMobile;
        this.employeeSkills = employeeSkills;
        this.employeeHobbies = employeeHobbies;
    }

    public String getEmployeeSkills() {
        return employeeSkills;
    }

    public void setEmployeeSkills(String employeeSkills) {
        this.employeeSkills = employeeSkills;
    }

    public Employee(int employeeId, String employeeName, String employeeAddress, int employeeMobile, String employeeSkills, String employeeHobbies) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeMobile = employeeMobile;
        this.employeeSkills = employeeSkills;
        this.employeeHobbies = employeeHobbies;
    }

    public String getEmployeeHobbies() {
        return employeeHobbies;
    }

    public void setEmployeeHobbies(String employeeHobbies) {
        this.employeeHobbies = employeeHobbies;
    }



    public Employee() {
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeMobile=" + employeeMobile + '\'' +
                ", employeeSkills=" + employeeSkills +
                ", employeeHobbies='" + employeeHobbies + '\'' +
                '}';
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public int getEmployeeMobile() {
        return employeeMobile;
    }

    public void setEmployeeMobile(int employeeMobile) {
        this.employeeMobile = employeeMobile;
    }
}
