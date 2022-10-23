package com.muravskyi.spring.security.configuration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TheController {

    @GetMapping("/")
    public String getInfoForAllEmployees() {
        return "view_for_all_employees";
    }

    @GetMapping("/hr_info")
    public String getHrInfo() {
        return "view_for_hr";
    }

    @GetMapping("/manager_info")
    public String getManagersInfo() {
        return "view_for_managers";
    }

}
