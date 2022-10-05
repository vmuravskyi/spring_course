package com.muravskyi.spring.spring_introduction;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotationsTest1 {

    @Test
    public void test1() {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext3.xml");

        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();
    }

    @Test
    public void test2() {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

    }

}
