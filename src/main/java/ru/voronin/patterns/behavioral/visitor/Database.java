package ru.voronin.patterns.behavioral.visitor;

public class Database implements ProjectElement {
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
