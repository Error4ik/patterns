package ru.voronin.patterns.abstrack_factory.website;

import ru.voronin.patterns.abstrack_factory.Developer;

public class PhpDeveloper implements Developer {
    public void writeCode() {
        System.out.println("Write php code...");
    }
}
