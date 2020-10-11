package ru.voronin.patterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgresSQL"};
        JavaDeveloper developer = new JavaDeveloper("Alex", skills);

        Iterator iterator = developer.getIterator();
        System.out.println(String.format("Developer: %s", developer.getName()));
        System.out.println("Skills: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
