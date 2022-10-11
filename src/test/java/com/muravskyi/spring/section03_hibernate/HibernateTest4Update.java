package com.muravskyi.spring.section03_hibernate;

import com.muravskyi.spring.section03_hibernate.entity.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class HibernateTest4Update {

    private Logger LOGGER = LogManager.getLogger();

    @Test
    void testEmployee() {
        SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Employee.class)
            .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            // no need to save or update, when commit transaction it will be saved in db
//            Employee employee = session.get(Employee.class, 1);
//            employee.setSalary(5350);

            // another option to updated with a custom query
            session.createQuery("update Employee set salary=850 where department='HR'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done");
        } finally {
            // make sure to close factory
            factory.close();
        }
    }

}
