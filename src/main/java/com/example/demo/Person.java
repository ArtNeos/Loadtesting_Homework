package com.example.demo;

public class Person {
    public String full_name;
    public int age;

    public Person(String first_name, String last_name, int year_of_birth) {
        this.full_name = first_name + " " + last_name;
        this.age = java.time.Year.now().getValue() - year_of_birth;
    }
}