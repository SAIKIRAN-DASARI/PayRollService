package com.example.spring.Payroll.repository;

import com.example.spring.Payroll.models.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPayrollRepo extends JpaRepository<Payroll,String> {
}
