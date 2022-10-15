package com.muravskyi.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class myController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "showDetails";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String employeeName = request.getParameter("employeeName");
//        String modifiedName = "Mr. " + employeeName;
//        model.addAttribute("nameAttribute", modifiedName);
//        model.addAttribute("description", " - QA Automation Engineer");
//        return "showDetails";
//    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@RequestParam("employeeName") String employeeName, Model model) {
        String modifiedName = "Mr. " + employeeName;
        model.addAttribute("nameAttribute", modifiedName);
        return "showDetails";
    }

}