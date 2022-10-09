package com.muravskyi.spring.section02_aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take a book at the UniversityLibrary ");
    }

    public void returnBook() {
        System.out.println("We return book to UniversityLibrary");
    }

    public void getMagazine() {
        System.out.println("We take a magazine at the UniversityLibrary");
    }

    public void returnMagazine() {
        System.out.println("We return magazine to UniversityLibrary");
    }

    public void addBook() {
        System.out.println("We add book to UniversityLibrary");
    }

    public void addMagazine() {
        System.out.println("We add magazine to UniversityLibrary");
    }

}
