package com.muravskyi.spring.spring_introduction;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    @Test
    void testInitAndDestroy() {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContextBeanScope.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        context.close();
    }

}
