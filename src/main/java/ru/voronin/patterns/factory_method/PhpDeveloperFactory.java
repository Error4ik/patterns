package ru.voronin.patterns.factory_method;

public class PhpDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
