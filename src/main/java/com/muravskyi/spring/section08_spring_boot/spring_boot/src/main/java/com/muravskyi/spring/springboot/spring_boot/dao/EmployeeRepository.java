package com.muravskyi.spring.springboot.spring_boot.dao;

import com.muravskyi.spring.springboot.spring_boot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // example of custom methods that doest not need implementation which is created from standard names offered by String
    public List<Employee> findAllByName(String contains);

//    public Employee findByNameAndSalaryLessThan(String name, Integer lessThan);

}
