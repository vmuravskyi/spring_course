package com.muravskyi.spring.section03_hibernate.hibernate_one_to_one;

import com.muravskyi.spring.section03_hibernate.hibernate_one_to_one.entity.Detail;
import com.muravskyi.spring.section03_hibernate.hibernate_one_to_one.entity.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class HibernateTest2 {

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
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = new Employee("OneToOne2", "BiDirectional2", "IT", 15000);
//            Detail detail = new Detail("Kyiv", "+987654321", "someEmail2@gmail.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//
//            session.save(detail);
//
//            session.getTransaction().commit();










//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 4 );
//            System.out.println(detail.getEmployee());
//
//            session.getTransaction().commit();









            session = factory.getCurrentSession();
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 3);
            detail.getEmployee().setEmpDetail(null); // break connection between employee and detail
            session.delete(detail);

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
