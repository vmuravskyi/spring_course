package com.muravskyi.spring.mvc_hibernate_aop.service;

import com.muravskyi.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveOrUpdate(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
