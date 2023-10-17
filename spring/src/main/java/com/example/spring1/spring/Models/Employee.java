package com.example.spring1.spring.Models;


import jakarta.persistence.*;

import java.util.List;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="emp_id")
    private int empId;

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

    public Address getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(Address empAddress) {
        this.empAddress = empAddress;
    }



    @Column(nullable=false)
    private String empName;

    @OneToOne(cascade=CascadeType.ALL)
    private Address empAddress;

//    @OneToMany(cascade=CascadeType.ALL)
//    @JoinColumn(name="fk_emp_id",referencedColumnName ="emp_id")
//    private List<Address> empAddress;


    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Column(nullable=true)
    private long salary;

//    public List<Address> getEmpAddress() {
//        return empAddress;
//    }
//
//    public void setEmpAddress(List<Address> empAddress) {
//        this.empAddress = empAddress;
//    }
}
