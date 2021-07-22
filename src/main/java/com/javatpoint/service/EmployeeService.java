package com.javatpoint.service;

import com.javatpoint.model.Employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee addEmployee(String empId,String firstName,String secondName){

        Employee emp =new Employee();
        emp.setEmpId(empId);
        emp.setFirstName(firstName);
        emp.setSecondName(secondName);
        // int v=9/0;
        return emp;
    }
    
}
