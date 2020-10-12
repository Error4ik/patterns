package ru.voronin.patterns.behavioral.template;

public class WebSiteRunner {
    public static void main(String[] args) {
        WebSiteTemplate welcomePage = new WelcomePage();
        WebSiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("============================");
        newsPage.showPage();
    }
}
