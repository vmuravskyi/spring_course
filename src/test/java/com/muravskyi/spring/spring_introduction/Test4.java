package com.muravskyi.spring.spring_introduction;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    @Test
    public void testBeanScope() {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContextBeanScope.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);

        System.out.println(myDog == yourDog);
    }

}
