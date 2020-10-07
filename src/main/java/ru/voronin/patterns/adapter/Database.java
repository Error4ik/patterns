package ru.voronin.patterns.adapter;

public interface Database {

    void insert();

    void update();

    void select();

    void remove();
}
