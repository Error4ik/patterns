package ru.voronin.patterns.behavioral.chain;

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println(String.format("Sending email %s", message));
    }
}
