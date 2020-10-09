package ru.voronin.patterns.creational.abstrack_factory;

import ru.voronin.patterns.creational.abstrack_factory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new BankingTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager manager = teamFactory.getProjectManager();

        System.out.println("Start");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
