package ru.voronin.patterns.behavioral.interpreter;

public interface Expression {
    boolean interpret(String context);
}
