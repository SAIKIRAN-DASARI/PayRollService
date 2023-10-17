package com.example.spring1.spring.Controller;

import com.example.spring1.spring.Models.Employee;
import com.example.spring1.spring.Service.implementatioins.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmpController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAll(){

        return ResponseEntity.ok(employeeService.findall());
    }


    @GetMapping("/getById/{id}")
    public ResponseEntity<Employee> getAll(@PathVariable String id){

        return ResponseEntity.ok(employeeService.findEmployeeById(id));
    }
    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp){
        return ResponseEntity.ok(employeeService.createEmployee(emp));
    }

    @PatchMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp){
        return ResponseEntity.ok(employeeService.updateEmployee(emp));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteEmployee(@PathVariable String id){
        return ResponseEntity.ok(employeeService.deleteEmployeeById(id));
    }

    @DeleteMapping("/deleteAll")
    public void deleteAllEmployeeDetails(){
      employeeService.deleteAllEmployeeDetails();
    }

    @PutMapping("/put/{empId}")
    public Employee updateByPutMetod(@PathVariable String empId,@RequestBody Employee emp){
        return employeeService.updateByPutMetod(empId,emp);
    }






}
