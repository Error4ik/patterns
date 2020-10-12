package ru.voronin.patterns.behavioral.mediator;

public class Admin implements User {
    private Chat chat;
    private String name;

    public Admin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        this.chat.sendMessage(message, this);
    }

    public void getMessage(String message) {
        System.out.println(String.format("%s receiving message: %s", this.getName(), message));
    }
}
