package com.muravskyi.spring.spring_introduction;

import org.junit.jupiter.api.Test;

public class DogTest {

    @Test
    public void testDog() {
        Pet pet = new Cat();
        pet.say();
    }

}
