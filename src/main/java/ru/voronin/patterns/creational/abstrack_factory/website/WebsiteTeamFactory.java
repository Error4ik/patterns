package ru.voronin.patterns.creational.abstrack_factory.website;

import ru.voronin.patterns.creational.abstrack_factory.Developer;
import ru.voronin.patterns.creational.abstrack_factory.ProjectManager;
import ru.voronin.patterns.creational.abstrack_factory.ProjectTeamFactory;
import ru.voronin.patterns.creational.abstrack_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    public Tester getTester() {
        return new ManualTester();
    }

    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
