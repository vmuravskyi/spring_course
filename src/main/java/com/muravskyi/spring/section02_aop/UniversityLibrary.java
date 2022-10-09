package com.muravskyi.spring.section02_aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We take a book at the UniversityLibrary ");
        System.out.println("-------------------------------------------------------------------------");
    }

    public void returnBook() {
        System.out.println("We return book to UniversityLibrary");
        System.out.println("-------------------------------------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("We take a magazine at the UniversityLibrary");
        System.out.println("-------------------------------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We return magazine to UniversityLibrary");
        System.out.println("-------------------------------------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We add book to UniversityLibrary");
        System.out.println("-------------------------------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add magazine to UniversityLibrary");
        System.out.println("-------------------------------------------------------------------------");
    }

}
