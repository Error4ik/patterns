package ru.voronin.patterns.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    public void buildName() {
        website.setName("Enterprise");
    }

    public void buildCMS() {
        website.setCms(CMS.ALIFRESCO);
    }

    public void buildPrice() {
        website.setPrice(10000);
    }
}
