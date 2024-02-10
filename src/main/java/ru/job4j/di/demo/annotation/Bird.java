package ru.job4j.di.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class Bird implements Pet<Bird> {
    private String name = "Bird";

    @Override
    public String print() {
        return "Bird name = %s".formatted(name);
    }
}
