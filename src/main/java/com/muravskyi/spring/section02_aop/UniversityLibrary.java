package com.muravskyi.spring.section02_aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {

    public void getBook(Book book) {
        System.out.println("We take a book at the UniversityLibrary " + book.getName());
    }

    public String returnBook() {
        System.out.println("We return book to UniversityLibrary");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("We take a magazine at the UniversityLibrary");
    }

}
