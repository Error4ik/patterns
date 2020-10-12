package ru.voronin.patterns.behavioral.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior working...");
        project.beWritten(junior);
        System.out.println("============================");
        System.out.println("Senior working...");
        project.beWritten(senior);
    }
}
