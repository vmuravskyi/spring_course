package com.muravskyi.spring.section01_spring_introduction;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    @Test
    public void testBeanScope() {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContextBeanScope.xml");
//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Jack");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Oliver");
//
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());
//        System.out.println(myDog == yourDog);
    }

}
