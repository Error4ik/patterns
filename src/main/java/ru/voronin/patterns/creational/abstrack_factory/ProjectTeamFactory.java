package ru.voronin.patterns.creational.abstrack_factory;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
