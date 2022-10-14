package com.muravskyi.spring.section03_hibernate.hibernate_many_to_many;

import com.muravskyi.spring.section03_hibernate.hibernate_many_to_many.entity.Child;
import com.muravskyi.spring.section03_hibernate.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

public class Test1 {

    @Test
    public void testManyToMany() {
        SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Child.class)
            .addAnnotatedClass(Section.class)
            .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Child1", 5);
//            Child child2 = new Child("Child2", 12);
//            Child child3 = new Child("Child3", 17);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();

            // ************************************************************************************************

//            Section section1 = new Section("Football");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Computers");
//            Child child1 = new Child("Jackson", 10);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();

            // ************************************************************************************************

//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();

            // ************************************************************************************************

//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();

            // ************************************************************************************************

//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 7);
//            session.delete(section);
//
//            session.getTransaction().commit();

            // ************************************************************************************************

            session.beginTransaction();

            Child child = session.get(Child.class, 7);
            session.delete(child);

            session.getTransaction().commit();

            System.out.println("Done");
        } finally {
            if (session != null) {
                session.close();
                factory.close();
            }
        }
    }

}
