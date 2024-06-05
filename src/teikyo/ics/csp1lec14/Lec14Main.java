package teikyo.ics.csp1lec14;

import teikyo.ics.csp1lec14.staff.*;
import teikyo.ics.csp1lec14.student.*;

public class Lec14Main {

    public static void main(String[] args) {

        Person[] persons = { new Teacher(), new Student() };

        for (int i = 0; i < persons.length; i++) {
            persons[i].printInfo();
        }
    }
}
