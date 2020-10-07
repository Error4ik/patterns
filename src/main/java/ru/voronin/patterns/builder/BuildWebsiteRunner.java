package ru.voronin.patterns.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
//        director.setBuilder(new EnterpriseWebsiteBuilder());

        Website website = director.buildWebsite();
        System.out.println(website);
    }
}
