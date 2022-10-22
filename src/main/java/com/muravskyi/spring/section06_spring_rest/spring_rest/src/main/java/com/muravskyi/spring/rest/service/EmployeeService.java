package com.muravskyi.spring.rest.service;

import com.muravskyi.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveOrUpdate(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
