package com.muravskyi.spring.section03_hibernate.hibernatetest2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "details")
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    public Detail() {
        // default
    }

    public Detail(String city, String phoneNumber, String email) {
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public Detail setId(int id) {
        this.id = id;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Detail setCity(String city) {
        this.city = city;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Detail setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Detail setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "Detail{" +
            "id=" + id +
            ", city='" + city + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", email='" + email + '\'' +
            '}';
    }

}
