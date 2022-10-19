package com.muravskyi.spring.mvc_hibernate_aop.controller;

import com.muravskyi.spring.mvc_hibernate_aop.dao.EmployeeDao;
import com.muravskyi.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping("/")
    public String showALlEmployees(Model model) {
        List<Employee> allEmployees = employeeDao.getAllEmployees();
        model.addAttribute("allEmployees", allEmployees);
        return "all-employees";
    }

}
