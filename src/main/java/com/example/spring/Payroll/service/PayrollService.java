package com.example.spring.Payroll.service;


import com.example.spring.Payroll.models.Payroll;
import com.example.spring.Payroll.repository.IPayrollRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayrollService {

    @Autowired
    private IPayrollRepo iPayrollRepo;



    public Payroll createPayRoll(Payroll payroll){
        return iPayrollRepo.save(payroll);
    }
}
