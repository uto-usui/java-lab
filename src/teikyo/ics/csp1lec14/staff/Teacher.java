package teikyo.ics.csp1lec14.staff;

import teikyo.ics.csp1lec14.*;

public class Teacher extends Person implements Worker {
    Job job;

    public Teacher() {
        this.name = "Taro";
        this.age = 40;
        this.job = new Lecturer();
    }

    @Override
    public Job getJob() {
        return job;
    }

    @Override
    public void printInfo() {
        System.out.println(this.getName() + "/" + this.getAge() + "/" + this.getJob().getJobName());
    }
}
