package ru.voronin.patterns.creational.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    public void buildName() {
        website.setName("VisitCard");
    }

    public void buildCMS() {
        website.setCms(CMS.WORDPRESS);
    }

    public void buildPrice() {
        website.setPrice(500);
    }
}
