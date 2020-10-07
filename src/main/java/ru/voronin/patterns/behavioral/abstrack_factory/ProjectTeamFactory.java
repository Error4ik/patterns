package ru.voronin.patterns.behavioral.abstrack_factory;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
