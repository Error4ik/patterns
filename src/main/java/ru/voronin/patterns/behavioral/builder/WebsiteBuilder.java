package ru.voronin.patterns.behavioral.builder;

public abstract class WebsiteBuilder {
    Website website;

    public void createWebsite() {
        this.website = new Website();
    }

    public abstract void buildName();
    public abstract void buildCMS();
    public abstract void buildPrice();

    public Website getWebsite() {
        return this.website;
    }
}
