package com.muravskyi.spring.springboot.spring_boot.controller;

import com.muravskyi.spring.springboot.spring_boot.entity.Employee;
import com.muravskyi.spring.springboot.spring_boot.exception_handling.NoSuchEmployeeException;
import com.muravskyi.spring.springboot.spring_boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TheController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        if (allEmployees.isEmpty()) {
            throw new NoSuchEmployeeException("No employees found");
        }
        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Optional<Employee> optEmployee = employeeService.getEmployee(id);
        if (optEmployee.isEmpty()) {
            throw new NoSuchEmployeeException(String.format("Employee with id [%s] was not found", id));
        }
        return optEmployee.get();
    }

    @GetMapping("/employees/name/{name}")
    public List<Employee> getAllByName(@PathVariable(name = "name") String name) {
        List<Employee> allByName = employeeService.findAllByName(name);
        if (allByName.isEmpty()) {
            throw new NoSuchEmployeeException(String.format("No employees by name [%s] found", name));
        }
        return allByName;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdate(employee);
        return employee;
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        Optional<Employee> optEmployee = employeeService.getEmployee(id);
        if (optEmployee.isEmpty()) {
            throw new NoSuchEmployeeException(String.format("Employee with id [%s] was not found", id));
        }
        employee.setId(id);
        employeeService.saveOrUpdate(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Optional<Employee> optEmployee = employeeService.getEmployee(id);
        if (optEmployee.isEmpty()) {
            throw new NoSuchEmployeeException(String.format("Employee with id [%s] was not found", id));
        }
        employeeService.deleteEmployee(id);
        return String.format("Employee with id %s was successfully deleted", id);
    }

}
