package ru.voronin.patterns.behavioral.abstrack_factory.banking;

import ru.voronin.patterns.behavioral.abstrack_factory.ProjectManager;

public class BankingPM implements ProjectManager {
    public void manageProject() {
        System.out.println("Banking pm manages project...");
    }
}
