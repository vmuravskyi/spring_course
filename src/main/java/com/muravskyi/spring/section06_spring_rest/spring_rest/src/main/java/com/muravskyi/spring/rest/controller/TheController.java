package com.muravskyi.spring.rest.controller;

import com.muravskyi.spring.rest.entity.Employee;
import com.muravskyi.spring.rest.exception_handling.NoSuchEmployeeException;
import com.muravskyi.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TheController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
        if (employee == null) {
            throw new NoSuchEmployeeException(String.format("Employee with id %s was not found", id));
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdate(employee);
        return employee;
    }

    @PutMapping("/employees/{id}")
    public Employee updateNewEmployee(@PathVariable int id, @RequestBody Employee employee) {
        Employee isEmployeeExist = employeeService.getEmployee(id);
        if (isEmployeeExist == null) {
            throw new NoSuchEmployeeException(String.format("Employee with id %s was not found", id));
        }
        employee.setId(id);
        employeeService.saveOrUpdate(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee isEmployeeExist = employeeService.getEmployee(id);
        if (isEmployeeExist == null) {
            throw new NoSuchEmployeeException(String.format("Employee with id %s was not found", id));
        }
        employeeService.deleteEmployee(id);
        return String.format("Employee with id %s was successfully deleted", id);
    }

}
