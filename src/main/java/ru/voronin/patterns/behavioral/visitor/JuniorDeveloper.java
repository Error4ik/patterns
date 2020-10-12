package ru.voronin.patterns.behavioral.visitor;

public class JuniorDeveloper implements Developer {
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class...");
    }

    public void create(Database database) {
        System.out.println("Drop database...");
    }

    public void create(Test test) {
        System.out.println("Creating not reliable tests... ");
    }
}
