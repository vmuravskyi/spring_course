package com.muravskyi.spring.rest.dao;

import com.muravskyi.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployees();

    public void saveOrUpdate(Employee employee);

    public Employee getEmployee(int id);

    public void delete(int id);
}
