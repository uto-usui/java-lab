package teikyo.ics.csp1lec14;

import teikyo.ics.csp1lec14.staff.*;
import teikyo.ics.csp1lec14.student.*;

public class Lec14Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setValues("Taro", 40);

        Student s = new Student();
        s.setValues("Hanako", 20);

        Person[] persons = {t, s};

        for (int i = 0; i < persons.length; i++) {
            persons[i].printInfo();
        }
    }
}
