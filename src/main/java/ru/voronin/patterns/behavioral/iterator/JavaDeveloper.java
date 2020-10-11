package ru.voronin.patterns.behavioral.iterator;

public class JavaDeveloper implements Collection {

    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public Iterator getIterator() {
        return new SkillIterator();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    private class SkillIterator implements Iterator {

        int index;

        public boolean hasNext() {
            return index < skills.length;
        }

        public Object next() {
            return skills[index++];
        }
    }
}
