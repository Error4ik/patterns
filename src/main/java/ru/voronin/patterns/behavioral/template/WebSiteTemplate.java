package ru.voronin.patterns.behavioral.template;

public abstract class WebSiteTemplate {
    public void showPage() {
        System.out.println("header");
        this.showPageContent();
        System.out.println("footer");
    }

    public abstract void showPageContent();
}
