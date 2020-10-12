package ru.voronin.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {
    private List<String> vacancies = new ArrayList<String>();
    private List<Observer> subscribers = new ArrayList<Observer>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        this.notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        this.notifyObservers();
    }

    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.handleEvent(this.vacancies);
        }
    }
}
