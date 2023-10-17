package com.example.spring1.spring.Service.interfaces;

import com.example.spring1.spring.Models.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IEmployee {
    Employee findEmployeeById(String Id);
    ResponseEntity<Object> deleteEmployeeById(String Id);
    Employee createEmployee(Employee emp);
    Employee updateEmployee(Employee emp);

    List<Employee> findall();
}
