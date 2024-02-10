package ru.job4j.di.demo;

import org.springframework.stereotype.Component;

import static java.lang.System.out;
@Component
public class StartUI {
    private Store store;

    public StartUI(Store store) {
        this.store = store;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        store.getAll().forEach(out::println);
    }
}
