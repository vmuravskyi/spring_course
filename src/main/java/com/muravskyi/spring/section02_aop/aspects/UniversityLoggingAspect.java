package com.muravskyi.spring.section02_aop.aspects;

import com.muravskyi.spring.section02_aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: Logging getting list of students BEFORE method getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        String modifiedNameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(modifiedNameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        double modifiedAvgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(modifiedAvgGrade);

        System.out.println("afterReturningGetStudentsLoggingAdvice: Logging getting list of students AFTER method getStudents");
    }

}
