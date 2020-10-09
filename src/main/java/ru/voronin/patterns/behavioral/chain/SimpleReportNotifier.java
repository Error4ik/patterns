package ru.voronin.patterns.behavioral.chain;

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println(String.format("Notifying using simple report %s", message));
    }
}
