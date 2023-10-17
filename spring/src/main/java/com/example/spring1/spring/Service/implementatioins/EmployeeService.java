package com.example.spring1.spring.Service.implementatioins;

import com.example.spring1.spring.Models.Address;
import com.example.spring1.spring.Models.Employee;
import com.example.spring1.spring.Models.Payroll;
import com.example.spring1.spring.Respository.IAddressRepo;
import com.example.spring1.spring.Respository.IEmpRepo;
import com.example.spring1.spring.Service.interfaces.IEmployee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;


@Service
@Transactional
public class EmployeeService implements IEmployee {

@Autowired
    private IEmpRepo empRepo;

@Autowired
private IAddressRepo addressRepo;
@Autowired
    public RestTemplate restTemplate;

    public Employee findEmployeeById(String Id) {
        return (empRepo.findById(Id).orElse(null));

    }



    public ResponseEntity<Object> deleteEmployeeById(String Id) {
        //empRepo.deleteById(Id);
        empRepo.findById(Id).ifPresent(empRepo::delete);
        return ResponseEntity.ok().build();
    }

    public void  deleteAllEmployeeDetails(){
        empRepo.deleteAll();
    }

    @Override
    public Employee createEmployee(Employee emp) {
        Address add=emp.getEmpAddress();
        addressRepo.save(add);

        Payroll payroll=new Payroll();
        payroll.setEmpId(emp.getEmpId());
        payroll.setSalary(emp.getSalary());
        payroll.setEmpName(emp.getEmpName());

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Payroll> entity = new HttpEntity<Payroll>(payroll,headers);

         restTemplate.exchange(
                "http://localhost:8081/createPayroll", HttpMethod.POST, entity, String.class).getBody();

        return empRepo.save(emp);
    }

    @Override
    public Employee updateEmployee(Employee emp) {
       Address add=emp.getEmpAddress();
        addressRepo.save(add);
        return empRepo.save(emp);
    }


    public List<Employee> findall() {
        return empRepo.findAll();

    }

    public Employee updateByPutMetod(String empId, Employee emp){
        String empName=emp.getEmpName();
        Employee emp2= empRepo.findById(empId).orElseThrow();
        emp2.setEmpName(empName);
        empRepo.save(emp2);
        return emp2;
    }
}
