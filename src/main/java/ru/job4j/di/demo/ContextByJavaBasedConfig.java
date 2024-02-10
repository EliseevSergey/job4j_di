package ru.job4j.di.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextByJavaBasedConfig {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("ru.job4j.di.demo");
        var ui = context.getBean(StartUI.class);
        ui.add("Petr");
        ui.add("Ivan");
        ui.print();
    }
}
