package com.example.spring1.spring.Respository;

import com.example.spring1.spring.Models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,String> {
}
