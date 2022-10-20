package com.muravskyi.spring.mvc_hibernate_aop.dao;

import com.muravskyi.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployees();

    public void saveOrUpdate(Employee employee);

    public Employee getEmployee(int id);

    public void delete(int id);
}
