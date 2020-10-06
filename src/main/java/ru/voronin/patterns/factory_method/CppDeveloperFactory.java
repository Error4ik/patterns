package ru.voronin.patterns.factory_method;

public class CppDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
