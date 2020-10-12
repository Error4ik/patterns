package ru.voronin.patterns.behavioral.visitor;

public class Test implements ProjectElement {
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
