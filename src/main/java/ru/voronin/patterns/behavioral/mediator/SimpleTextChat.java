package ru.voronin.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {
    private User admin;
    private List<User> userList = new ArrayList<User>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.userList.add(user);
    }

    public void sendMessage(String message, User user) {
        for (User u : userList) {
            if (u != user) {
                u.getMessage(message);
            }
        }
        this.admin.getMessage(message);
    }
}
