package ru.voronin.patterns.structural.bridge;

public class StockExchange extends Program {
    public StockExchange(Developer developer) {
        super(developer);
    }

    public void developProgram() {
        System.out.println("Stock system develop");
        developer.writeCode();
    }
}
