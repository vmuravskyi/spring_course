package com.muravskyi.spring.section03_hibernate.hibernate_one_to_one.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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

    @OneToOne(mappedBy = "empDetail", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Employee employee;

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

    public Employee getEmployee() {
        return employee;
    }

    public Detail setEmployee(Employee employee) {
        this.employee = employee;
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
