package ru.voronin.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<String, Developer>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);
        if (developer == null) {
            if (specialty.equalsIgnoreCase("java")) {
                System.out.println("Hiring java developer...");
                developer = new JavaDeveloper();
            } else if (specialty.equalsIgnoreCase("c++")) {
                System.out.println("Hiring c++ developer...");
                developer = new CppDeveloper();
            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}
