package ru.voronin.patterns.behavioral.command;

public class Developer {
    private Command insert;
    private Command update;
    private Command select;
    private Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertRecord() {
        this.insert.execute();
    }

    public void updateRecord() {
        this.update.execute();
    }

    public void selectRecord() {
        this.select.execute();
    }

    public void deleteRecord() {
        this.delete.execute();
    }
}
