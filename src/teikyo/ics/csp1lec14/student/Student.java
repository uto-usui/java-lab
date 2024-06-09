package teikyo.ics.csp1lec14.student;

import teikyo.ics.csp1lec14.*;

public class Student extends Person implements Learner, Settable {
    Study study;

    public Student() {
        this.study = new Programming();  // デフォルトはProgramming
    }

    @Override
    public Study getStudy() {
        return study;
    }

    @Override
    public void setValues(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setStudy(Study study) {
        this.study = study;
    }

    @Override
    public void printInfo() {
        System.out.println(this.getName() + "/" + this.getAge() + "/" + this.getStudy().getStudyName());
    }
}
