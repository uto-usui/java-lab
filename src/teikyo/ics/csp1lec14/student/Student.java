package teikyo.ics.csp1lec14.student;

import teikyo.ics.csp1lec14.*;

public class Student extends Person implements Learner {
    Study study;

    public Student() {
        this.study = new Programming();
        this.age = 20;
        this.name = "Hanako";
    }

    @Override
    public Study getStudy() {
        return study;
    }

    @Override
    public void printInfo() {
        System.out.println(this.getName() + "/" + this.getAge() + "/" + this.getStudy().getStudyName());
    }
}
