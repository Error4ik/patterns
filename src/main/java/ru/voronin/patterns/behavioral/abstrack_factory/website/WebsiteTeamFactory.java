package ru.voronin.patterns.behavioral.abstrack_factory.website;

import ru.voronin.patterns.behavioral.abstrack_factory.Developer;
import ru.voronin.patterns.behavioral.abstrack_factory.ProjectManager;
import ru.voronin.patterns.behavioral.abstrack_factory.ProjectTeamFactory;
import ru.voronin.patterns.behavioral.abstrack_factory.Tester;

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
