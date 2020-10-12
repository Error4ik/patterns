package ru.voronin.patterns.behavioral.visitor;

public class ProjectClass implements ProjectElement {
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
