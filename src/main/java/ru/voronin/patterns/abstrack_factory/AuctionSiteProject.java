package ru.voronin.patterns.abstrack_factory;

import ru.voronin.patterns.abstrack_factory.banking.BankingTeamFactory;
import ru.voronin.patterns.abstrack_factory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new WebsiteTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager manager = teamFactory.getProjectManager();

        System.out.println("Start");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
