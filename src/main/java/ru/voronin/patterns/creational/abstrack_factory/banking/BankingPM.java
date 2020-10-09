package ru.voronin.patterns.creational.abstrack_factory.banking;

import ru.voronin.patterns.creational.abstrack_factory.ProjectManager;

public class BankingPM implements ProjectManager {
    public void manageProject() {
        System.out.println("Banking pm manages project...");
    }
}
