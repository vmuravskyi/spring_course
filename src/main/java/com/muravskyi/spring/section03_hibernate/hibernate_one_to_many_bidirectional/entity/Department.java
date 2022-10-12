package com.muravskyi.spring.section03_hibernate.hibernate_one_to_many_bidirectional.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String departmentName;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "min_salary")
    private int minSalary;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE},
        mappedBy = "department")
    private List<Employee> employees;

    public Department() {
        // default
    }

    public Department(String departmentName, int maxSalary, int minSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void addEmployeeToDepartment(Employee employee) {
        if (employees == null) {
            employees = new ArrayList<>();
        }
        employees.add(employee);
        employee.setDepartment(this);
    }

    public int getId() {
        return id;
    }

    public Department setId(int id) {
        this.id = id;
        return this;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Department setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public Department setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
        return this;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public Department setMinSalary(int minSalary) {
        this.minSalary = minSalary;
        return this;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Department setEmployees(
        List<Employee> employees) {
        this.employees = employees;
        return this;
    }

    @Override
    public String toString() {
        return "Department{" +
            "id=" + id +
            ", departmentName='" + departmentName + '\'' +
            ", maxSalary=" + maxSalary +
            ", minSalary=" + minSalary +
            '}';
    }

}
