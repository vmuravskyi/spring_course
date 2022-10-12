package com.muravskyi.spring.section03_hibernate.hibernate_one_to_many_bidirectional.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "salary")
    private int salary;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE})
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee() {
        // default
    }

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Employee setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getSalary() {
        return salary;
    }

    public Employee setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public Department getDepartment() {
        return department;
    }

    public Employee setDepartment(
        Department department) {
        this.department = department;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", salary=" + salary +
            ", department=" + department +
            '}';
    }

}
