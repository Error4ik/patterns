package ru.voronin.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Developer> developerList = new ArrayList<Developer>();

    public void addDeveloper(Developer developer) {
        this.developerList.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        this.developerList.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates project...");
        for (Developer developer : developerList) {
            developer.writeCode();
        }
    }
}
