package com.muravskyi.spring.section02_aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {

    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {}

}
