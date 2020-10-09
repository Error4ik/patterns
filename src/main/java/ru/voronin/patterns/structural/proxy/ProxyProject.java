package ru.voronin.patterns.structural.proxy;

public class ProxyProject implements Project {
    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    public void run() {
        if (realProject == null) {
            realProject = new RealProject(this.url);
        }
        realProject.run();
    }
}
