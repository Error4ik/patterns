package ru.voronin.patterns.behavioral.abstrack_factory.website;

import ru.voronin.patterns.behavioral.abstrack_factory.ProjectManager;

public class WebsitePM implements ProjectManager {
    public void manageProject() {
        System.out.println("Website pm manages project...");
    }
}
