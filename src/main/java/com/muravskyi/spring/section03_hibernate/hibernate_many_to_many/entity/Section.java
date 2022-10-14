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
@Table(name = "section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH},
        fetch = FetchType.LAZY)
    @JoinTable(name = "child_section",
        joinColumns = @JoinColumn(name = "section_id"),
        inverseJoinColumns = @JoinColumn(name = "child_id"))
    private List<Child> children;

    public Section() {
        // default
    }

    public Section(String name) {
        this.name = name;
    }

    public Section(String name,
        List<Child> children) {
        this.name = name;
        this.children = children;
    }

    public void addChildToSection(Child child) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        children.add(child);
    }

    public int getId() {
        return id;
    }

    public Section setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Section setName(String name) {
        this.name = name;
        return this;
    }

    public List<Child> getChildren() {
        return children;
    }

    public Section setChildren(
        List<Child> children) {
        this.children = children;
        return this;
    }

    @Override
    public String toString() {
        return "Section{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }

}
