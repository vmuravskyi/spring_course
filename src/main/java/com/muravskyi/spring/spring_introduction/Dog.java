package com.muravskyi.spring.spring_introduction;

public class Dog implements Pet {

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

}
