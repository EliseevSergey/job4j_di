package ru.job4j.di.demo.annotation;

public class Dog implements Pet<Dog> {
    private String name;
    public Dog() {

    }
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return "Dog name = %s".formatted(name);
    }
}
