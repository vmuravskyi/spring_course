package com.muravskyi.spring.section02_aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("We take a book at the SchoolLibrary");
    }
}
