package com.example.spring1.spring.Respository;


import com.example.spring1.spring.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpRepo extends JpaRepository<Employee,String> {

   // Employee updateByPutMetod(String empID,Employee emp);


}
