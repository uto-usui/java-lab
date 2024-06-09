package teikyo.ics.csp1lec14.staff;

import teikyo.ics.csp1lec14.*;

public class Teacher extends Person implements Worker, Settable {
    Job job;

    public Teacher() {
        this.job = new Lecturer();
    }

    @Override
    public Job getJob() {
        return job;
    }

    @Override
    public void setValues(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void printInfo() {
        System.out.println(this.getName() + "/" + this.getAge() + "/" + this.getJob().getJobName());
    }
}
