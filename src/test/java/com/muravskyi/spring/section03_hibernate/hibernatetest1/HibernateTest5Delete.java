package com.muravskyi.spring.section03_hibernate.hibernatetest1;

import com.muravskyi.spring.section03_hibernate.hibernatetest1.entity.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class HibernateTest5Delete {

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

            Employee employee = session.get(Employee.class, 41);
            session.delete(employee);

            // to delete more than one object use custom query
//            session.createQuery("delete Employee where name='Bruce'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done");
        } finally {
            // make sure to close factory
            factory.close();
        }
    }

}
