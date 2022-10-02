package com.muravskyi.spring.spring_introduction;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    @Test
    public void testNoDi() {
        Pet pet = new Dog();
        Person person = new Person(pet);
        person.callYourPet();
    }

    // example of highly dependent objects
    @Test
    public void testDi() {
        // create application context
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");

        // get spring bean
        Pet pet = context.getBean("myPet", Pet.class);

        // insert bean into person's constructor
        Person person = new Person(pet);
        person.callYourPet();

        // close context
        context.close();
    }

}
