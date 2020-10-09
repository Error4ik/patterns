package ru.voronin.patterns.structural.proxy;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println(String.format("Loading project from %s...", this.url));
    }
    public void run() {
        System.out.println(String.format("Running project %s...", this.url));
    }
}
