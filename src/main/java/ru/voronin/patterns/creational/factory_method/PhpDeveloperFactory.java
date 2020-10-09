package ru.voronin.patterns.creational.factory_method;

public class PhpDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
