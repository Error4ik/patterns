package ru.voronin.patterns.behavioral.chain;

public class SmsNotifier extends Notifier {
    public SmsNotifier(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println(String.format("Sending sms %s", message));
    }
}
