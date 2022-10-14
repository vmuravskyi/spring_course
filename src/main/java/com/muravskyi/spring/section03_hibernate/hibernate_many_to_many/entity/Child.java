package com.muravskyi.spring.section03_hibernate.hibernate_many_to_many.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "children")
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH},
        fetch = FetchType.LAZY)
    @JoinTable(name = "child_section",
        joinColumns = @JoinColumn(name = "child_id"),
        inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sections;

    public Child() {
        // default
    }

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Child(String name, int age, List<Section> sections) {
        this.name = name;
        this.age = age;
        this.sections = sections;
    }

    public void addSectionToChild(Section section) {
        if (this.sections == null) {
            sections = new ArrayList<>();
        }
        this.sections.add(section);
    }

    public int getId() {
        return id;
    }

    public Child setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Child setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Child setAge(int age) {
        this.age = age;
        return this;
    }

    public List<Section> getSections() {
        return sections;
    }

    public Child setSections(
        List<Section> sections) {
        this.sections = sections;
        return this;
    }

    @Override
    public String toString() {
        return "Child{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

}
