package ru.voronin.patterns.structural.adapter;

public class AdapterJavaToDatabase extends JavaApplication implements Database {

    public void insert() {
        addObj();
    }

    public void update() {
        updateObj();
    }

    public void select() {
        loadObj();
    }

    public void remove() {
        deleteObj();
    }
}
