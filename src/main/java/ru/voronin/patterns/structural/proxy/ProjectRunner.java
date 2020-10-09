package ru.voronin.patterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/user/realProject");
        project.run();
    }
}
