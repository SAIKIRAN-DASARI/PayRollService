package com.example.spring1.spring.Models;



import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private long salary;
    private String empName;

    public void setSalary(long salary) {
        this.salary = salary;
    }


    public long getSalary() {
        return salary;
    }

    public int getEmpId() {
        return empId;
    }



    public void setEmpId(int empId) {
        this.empId = empId;
    }



    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
