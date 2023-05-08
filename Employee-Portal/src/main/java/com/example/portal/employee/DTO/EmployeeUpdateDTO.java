package com.example.portal.employee.DTO;

import java.util.Arrays;

public class EmployeeUpdateDTO {
    private int employeeId;
    private String employeeName;
    private String employeeAddress;
    private int employeeMobile;
    private String employeeSkills;
    private String employeeHobbies;


    public EmployeeUpdateDTO() {
    }

    public EmployeeUpdateDTO(int employeeId, String employeeName, String employeeAddress, int employeeMobile, String employeeSkills, String employeeHobbies) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeMobile = employeeMobile;
        this.employeeSkills = employeeSkills;
        this.employeeHobbies = employeeHobbies;
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

    public String getEmployeeSkills() {
        return employeeSkills;
    }

    public void setEmployeeSkills(String employeeSkills) {
        this.employeeSkills = employeeSkills;
    }

    public String getEmployeeHobbies() {
        return employeeHobbies;
    }

    public void setEmployeeHobbies(String employeeHobbies) {
        this.employeeHobbies = employeeHobbies;
    }

    @Override
    public String toString() {
        return "EmployeeUpdateDTO{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeMobile=" + employeeMobile +
                ", employeeSkills=" + employeeSkills +
                ", employeeHobbies='" + employeeHobbies + '\'' +
                '}';
    }
}

