package ru.voronin.patterns.builder;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    public Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCMS();
        builder.buildPrice();

        return builder.getWebsite();
    }
}
