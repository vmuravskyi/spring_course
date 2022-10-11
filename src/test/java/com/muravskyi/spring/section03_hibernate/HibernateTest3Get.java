package com.muravskyi.spring.section03_hibernate;

import com.muravskyi.spring.section03_hibernate.entity.Employee;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class HibernateTest3Get {

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

//            List<Employee> employees = session.createQuery("from Employee").getResultList();
            List<Employee> employees = session.createQuery("from Employee "
                    + "where name='Lara' and salary>1000")
                .getResultList();

            for (Employee e : employees) {
                System.out.println(e);
            }

            session.getTransaction().commit();
            System.out.println("Done");
        } finally {
            // make sure to close factory
            factory.close();
        }
    }

}
