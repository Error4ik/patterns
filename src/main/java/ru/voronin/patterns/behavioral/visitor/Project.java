package ru.voronin.patterns.behavioral.visitor;

public class Project implements ProjectElement {

    private ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    public void beWritten(Developer developer) {
        for (ProjectElement projectElement : projectElements) {
            projectElement.beWritten(developer);
        }
    }
}
