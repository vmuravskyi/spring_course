package com.muravskyi.spring.section02_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    // execution(* *(..)) - any return type, any method name, any number of parameters and their types

    @Before("execution(public void getBook(com.muravskyi.spring.section02_aop.Book))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: trying to get a book");
    }

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: trying to return a book");
    }

}
