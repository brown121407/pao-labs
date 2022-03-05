package com.company.ex1;

public class Person {
    private String name;
    private String surname;
    private int age;
    private long identity;
    private String type;

    public Person(String name, String surname, int age, long identity, String type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identity = identity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getIdentity() {
        return identity;
    }

    public void setIdentity(long identity) {
        this.identity = identity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", identity=" + identity +
                ", type='" + type + '\'' +
                '}';
    }
}
