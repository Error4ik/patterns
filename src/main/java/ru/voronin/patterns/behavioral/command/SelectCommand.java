package ru.voronin.patterns.behavioral.command;

public class SelectCommand implements Command {

    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    public void execute() {
        this.database.select();
    }
}
