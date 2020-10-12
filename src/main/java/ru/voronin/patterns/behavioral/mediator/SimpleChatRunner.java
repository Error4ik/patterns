package ru.voronin.patterns.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat simpleTextChat = new SimpleTextChat();
        User admin = new Admin(simpleTextChat,"Admin");
        User user1 = new Admin(simpleTextChat,"Alex");
        User user2 = new Admin(simpleTextChat,"John");

        simpleTextChat.setAdmin(admin);
        simpleTextChat.addUserToChat(user1);
        simpleTextChat.addUserToChat(user2);

        user1.sendMessage("I'm user one");
        user2.sendMessage("I'm user two");
        admin.sendMessage("I'm administrator");
    }
}
