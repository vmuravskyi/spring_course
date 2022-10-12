package com.muravskyi.spring.section03_hibernate.hibernate_one_to_one;

import com.muravskyi.spring.section03_hibernate.hibernate_one_to_one.entity.Detail;
import com.muravskyi.spring.section03_hibernate.hibernate_one_to_one.entity.Employee;
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
            .addAnnotatedClass(Detail.class)
            .buildSessionFactory();

        Session session = null;
        try {
//            // Get created session in configuration. Can be used same session all around the application.
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = new Employee("Michael", "Jackson", "Entertainment", 50000);
//            Detail detail = new Detail("Las Vegas", "+9 999 999 999", "michael.jackson@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.save(employee);
//
//            session.getTransaction().commit();




//            // Get created session in configuration. Can be used same session all around the application.
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = new Employee("Oliver", "Lawrence", "IT", 110000);
//            Detail detail = new Detail("Seattle", "+9 123 456 789", "oliver.lawrence@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.save(employee);
//
//            session.getTransaction().commit();





//            // Get created session in configuration. Can be used same session all around the application.
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getEmpDetail());
//
//            session.getTransaction().commit();




            // Get created session in configuration. Can be used same session all around the application.
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
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
