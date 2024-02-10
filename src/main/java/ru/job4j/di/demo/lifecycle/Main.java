package ru.job4j.di.demo.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru/job4j/di/demo/lifecycle");
        context.close();
    }
}
