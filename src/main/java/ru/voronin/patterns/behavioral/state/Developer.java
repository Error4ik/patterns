package ru.voronin.patterns.behavioral.state;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleeping) {
            this.setActivity(new Training());
        } else if (activity instanceof Training) {
            this.setActivity(new Codding());
        } else if (activity instanceof Codding) {
            this.setActivity(new Reading());
        } else if (activity instanceof Reading) {
            this.setActivity(new Sleeping());
        }
    }

    public void justDoIt() {
        this.activity.justDoIt();
    }
}
