package com.example.spring.Payroll.controller;

import com.example.spring.Payroll.models.Payroll;
import com.example.spring.Payroll.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    public PayrollService payrollService;



    @PostMapping("/createPayroll")
    public ResponseEntity<Payroll> createPayroll(@RequestBody Payroll payroll){

        return ResponseEntity.ok(payrollService.createPayRoll(payroll));
    }
}
