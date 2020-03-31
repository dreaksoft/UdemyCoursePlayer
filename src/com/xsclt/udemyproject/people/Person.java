package com.xsclt.udemyproject.people;

import java.util.Objects;

abstract public class Person {

    // Fields
    private String name;
    private String email;
    private static int peopleNumber = 241230;
    private int id;
    private int age;

    // Constructor
    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        id = peopleNumber++;
    }

    // Get methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    // getInfo -> Print properties on screen
    public void getInfo() {

        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "Id : " + id + " Name : " + name + " Age : " + age + " Email : " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
