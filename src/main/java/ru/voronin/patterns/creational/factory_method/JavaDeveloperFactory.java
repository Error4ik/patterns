package ru.voronin.patterns.creational.factory_method;

public class JavaDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
