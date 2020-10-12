package ru.voronin.patterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();
        site.addVacancy("First java position");
        site.addVacancy("Second java position");

        Observer firstSub = new Subscriber("Alex");
        Observer secondSub = new Subscriber("John");

        site.addObserver(firstSub);
        site.addObserver(secondSub);

        site.addVacancy("Third java position");
        site.addObserver(new Subscriber("Garry"));
        site.addVacancy("First android developer");

        site.removeVacancy("Second java position");
    }
}
