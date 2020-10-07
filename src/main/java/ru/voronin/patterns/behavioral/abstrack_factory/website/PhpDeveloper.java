package ru.voronin.patterns.behavioral.abstrack_factory.website;

import ru.voronin.patterns.behavioral.abstrack_factory.Developer;

public class PhpDeveloper implements Developer {
    public void writeCode() {
        System.out.println("Write php code...");
    }
}
