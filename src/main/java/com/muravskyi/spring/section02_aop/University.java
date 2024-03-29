package com.muravskyi.spring.section02_aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Volodymyr Muravskyi", 5, 9.5);
        Student st2 = new Student("Jack Johnson", 2, 8.3);
        Student st3 = new Student("Oliver Lawrence", 4, 9.1);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Beginning of method getStudents()");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }

}
