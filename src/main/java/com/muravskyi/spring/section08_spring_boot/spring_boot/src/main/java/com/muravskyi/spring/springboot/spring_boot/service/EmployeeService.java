package com.muravskyi.spring.springboot.spring_boot.service;


import com.muravskyi.spring.springboot.spring_boot.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveOrUpdate(Employee employee);

    public Optional<Employee> getEmployee(int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);
}
