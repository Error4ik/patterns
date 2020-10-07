package ru.voronin.patterns.behavioral.factory_method;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = createDeveloperFactoryBySpecialty("php");
        Developer developer = factory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(String.format("%s is unknown specialty", specialty));
        }
    }
}
