package com.muravskyi.spring.section02_aop;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);

//        Book book = context.getBean("book", Book.class);
        universityLibrary.getBook();
        universityLibrary.getMagazine();
//        universityLibrary.returnBook();
//        universityLibrary.getMagazine();

//        schoolLibrary.getBook();

        context.close();
    }

}
