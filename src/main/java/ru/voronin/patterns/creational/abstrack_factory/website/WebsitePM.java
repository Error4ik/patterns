package ru.voronin.patterns.creational.abstrack_factory.website;

import ru.voronin.patterns.creational.abstrack_factory.ProjectManager;

public class WebsitePM implements ProjectManager {
    public void manageProject() {
        System.out.println("Website pm manages project...");
    }
}
