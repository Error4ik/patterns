package ru.voronin.patterns.factory_method;

public class JavaDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
