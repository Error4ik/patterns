package ru.voronin.patterns.behavioral.visitor;

public class SeniorDeveloper implements Developer {
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after junior...");
    }

    public void create(Database database) {
        System.out.println("Fixing database...");
    }

    public void create(Test test) {
        System.out.println("Creating reliable tests...");
    }
}
