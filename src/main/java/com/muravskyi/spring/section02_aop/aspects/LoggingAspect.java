package com.muravskyi.spring.section02_aop.aspects;

import com.muravskyi.spring.section02_aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

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

    @Before("MyPointCuts.allAddMethods()")
    public void beforeAddLoggingBookAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object arg : args) {
                if (arg instanceof Book) {
                    Book myBook = (Book) arg;
                    System.out.println("Info about book: name - " + myBook.getName() + ", author - "
                            + myBook.getAuthor() + ", year of publication - " + myBook.getYearOfPublication());
                } else if (arg instanceof String) {
                    System.out.println("Book added by: " + arg);
                }
            }
        }
        System.out.println("beforeGetBookAdvice: Logging attempt to get a book/magazine");
        System.out.println("-------------------------------------------------------------------------");
    }

}
