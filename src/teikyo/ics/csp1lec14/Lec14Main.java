package teikyo.ics.csp1lec14;

import teikyo.ics.csp1lec14.staff.*;
import teikyo.ics.csp1lec14.student.*;

public class Lec14Main {
    public static void main(String[] args) {
        try {
            if (args.length == 0 || args.length % 3 != 0) {
                throw new IllegalArgumentException("プログラム引数を見直してください");
            }

            Person[] persons = new Person[args.length / 3];
            int index = 0;

            for (int i = 0; i < args.length; i += 3) {
                String type = args[i];
                String name = args[i + 1];
                int age;

                try {
                    age = Integer.parseInt(args[i + 2]);
                } catch (NumberFormatException e) {
                    System.out.println("年齢が正しく入力されていません");
                    return;
                }

                if (type.equals("Teacher")) {
                    Teacher t = new Teacher();
                    t.setValues(name, age);
                    persons[index++] = t;
                } else if (type.equals("Student")) {
                    Student s = new Student();
                    s.setValues(name, age);
                    persons[index++] = s;
                } else {
                    System.out.println("不正なクラス指定です: " + type);
                    return;
                }
            }

            for (Person person : persons) {
                person.printInfo();
            }

        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("プログラム引数を見直してください");
        }
    }
}
