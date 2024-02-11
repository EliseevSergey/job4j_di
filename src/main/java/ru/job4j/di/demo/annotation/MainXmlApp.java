package ru.job4j.di.demo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXmlApp {
    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("app-context-xml.xml");
        Man man = ct.getBean(Man.class);
        man.print();
    }
}
