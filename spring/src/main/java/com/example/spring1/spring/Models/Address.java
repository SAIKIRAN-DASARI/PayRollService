package com.example.spring1.spring.Models;


import jakarta.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int addressId;


    //for Bidirectional one-one mapping
//    @OneToOne(mappedBy = "empAddress")
//    private Employee employee;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Column(nullable=true)
    private String state;
    @Column(nullable=true)
    private String street;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    @Column(nullable=false)
    private String country;
}
