package ru.voronin.patterns.creational.abstrack_factory.banking;

import ru.voronin.patterns.creational.abstrack_factory.Developer;
import ru.voronin.patterns.creational.abstrack_factory.ProjectManager;
import ru.voronin.patterns.creational.abstrack_factory.ProjectTeamFactory;
import ru.voronin.patterns.creational.abstrack_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QATester();
    }

    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
