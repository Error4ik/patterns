package ru.voronin.patterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJavaDeveloper = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println(String.format("Does developer knows java core %s", isJavaDeveloper.interpret("Java core")));
        System.out.println(String.format("Does developer knows java EE %s", isJavaEEDeveloper.interpret("Java Spring")));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java core");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Spring");
        return new AndExpression(java, javaCore);
    }
}
