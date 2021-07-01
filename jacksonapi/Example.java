package com.tuncode.jacksonapi;


import java.util.ArrayList;

public class Example {

    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<?> languages;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Example() {

    }

    public ArrayList<?> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<?> languages) {
        this.languages = languages;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
