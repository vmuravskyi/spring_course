package com.muravskyi.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;

//    @Value("${person.surname}")
    private String surname;

//    @Value("${person.age}")
    private int age;

//    public Person() {
//        System.out.println("Person bean is created");
//    }

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: setSurname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: setAge");
        this.age = age;
    }

//    @Autowired
//    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person: setPet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, pet!");
        pet.say();
    }

}
