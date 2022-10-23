package com.muravskyi.rest.client;

import com.muravskyi.rest.client.configuration.TheConfig;
import com.muravskyi.rest.client.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TheConfig.class);
        Communication communication = context.getBean("communication", Communication.class);


//        List<Employee> allEmployees = communication.getAllEmployees();
//        allEmployees.forEach(System.out::println);

//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

        Employee employee = new Employee("Rest", "Client", "IT", 1000);
        Employee saved = communication.saveOrUpdateEmployee(employee);
        System.out.println(saved);

        saved.setDepartment("HR");
        Employee updatedEmployee = communication.saveOrUpdateEmployee(saved);
        System.out.println(updatedEmployee);

//        String responseMessage = communication.deleteEmployee(18);
//        System.out.println(responseMessage);

    }

}
