package ru.voronin.patterns.behavioral.chain;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, int priority) {
        if (priority >= this.priority) {
            this.write(message);
        }
        if (nextNotifier != null) {
            this.nextNotifier.notifyManager(message, priority);
        }
    }

    public abstract void write(String message);
}
