package com.muravskyi.spring.section01_spring_introduction;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

//    @Test
//    public void testNoDi() {
//        Pet pet = new Dog();
//        Person person = new Person(pet);
//        person.callYourPet();
//    }

    // example of highly dependent objects
//    @Test
//    public void testNoDi2() {
//        // create application context
//        ClassPathXmlApplicationContext context =
//            new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        // get spring bean
//        Pet pet = context.getBean("myPet", Pet.class);
//
//         insert bean into person's constructor
//        Person person = new Person(pet);
//        person.callYourPet();
//
//        // close context
//        context.close();
//    }

    // example of Dependency Injection
    @Test
    public void testDi() {
        // create application context
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get Person bean with already injected Pet object
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Age: " + person.getAge());

        // close context
        context.close();
    }

}
