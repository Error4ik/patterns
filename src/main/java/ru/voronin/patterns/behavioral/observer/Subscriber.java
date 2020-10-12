package ru.voronin.patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void handleEvent(List<String> vacancies) {
        System.out.println(String.format("Dear %s we have some changes in vacancies: %s", this.name, vacancies));
        System.out.println("=======================");
    }
}
