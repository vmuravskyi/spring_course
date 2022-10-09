package com.muravskyi.spring.section02_aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    // execution(* *(..)) - any return type, any method name, any number of parameters and their types


//    @Pointcut("execution(* com.muravskyi.spring.section02_aop.UniversityLibrary.*(..))")
//    private void allMethodsFromUniversityLibrary() {}
//
//    @Pointcut("execution(public void com.muravskyi.spring.section02_aop.UniversityLibrary.returnMagazine())")
//    private void returnMagazineFromUniversityLibrary() {}
//
//    @Pointcut("allMethodsFromUniversityLibrary() && !returnMagazineFromUniversityLibrary()")
//    private void allMethodsButNotReturnMagazine() {}
//
//    @Before("allMethodsButNotReturnMagazine()")
//    private void beforeAllMethodsButNotReturnMagazine() {
//        System.out.println("beforeAllMethodsButNotReturnMagazine");
//    }


//    @Pointcut("execution(* com.muravskyi.spring.section02_aop.UniversityLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* com.muravskyi.spring.section02_aop.UniversityLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniversityLibrary() {
//    }
//
//    @Before("allGetAndReturnMethodsFromUniversityLibrary()")
//    private void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }

    @Before("MyPointCuts.allGetMethods()")
    public void beforeGetLoggingBookAdvice() {
        System.out.println("beforeGetBookAdvice: Logging attempt to get a book/magazine");
    }

}
