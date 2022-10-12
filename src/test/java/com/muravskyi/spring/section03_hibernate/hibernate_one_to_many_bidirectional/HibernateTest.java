package com.muravskyi.spring.section03_hibernate.hibernate_one_to_many_bidirectional;

import com.muravskyi.spring.section03_hibernate.hibernate_one_to_many_bidirectional.entity.Department;
import com.muravskyi.spring.section03_hibernate.hibernate_one_to_many_bidirectional.entity.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class HibernateTest {

    private Logger LOGGER = LogManager.getLogger();

    @Test
    void saveEmployee() {
        SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Employee.class)
            .addAnnotatedClass(Department.class)
            .buildSessionFactory();

        Session session = null;
        try {
            // Get created session in configuration. Can be used same session all around the application.
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Department department = new Department("IT", 300, 3500);
//            Employee employee1 = new Employee("Junior", "Programmer", 1000);
//            Employee employee2 = new Employee("Senior", "Programmer", 3500);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//
//            session.save(department);









//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmployees());










//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getDepartment());










            Employee employee = session.get(Employee.class, 3);
            session.delete(employee);

            session.getTransaction().commit();
        } finally {
            if (session != null) {
                session.close();
            }
            // make sure to close factory
            factory.close();
        }
    }

}
