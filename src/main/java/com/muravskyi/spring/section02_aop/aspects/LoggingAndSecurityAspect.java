package com.muravskyi.spring.section02_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    // execution(* *(..)) - any return type, any method name, any number of parameters and their types

    @Pointcut("execution(* get*())")
    private void allGetMethods() {}

    @Before("allGetMethods()")
    public void beforeGetLoggingBookAdvice() {
        System.out.println("beforeGetBookAdvice: logging get a book/magazine");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: checking rights for getting book/magazine");
    }

}
