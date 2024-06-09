package teikyo.ics.csp1lec14;
import teikyo.ics.csp1lec14.staff.*;
import teikyo.ics.csp1lec14.student.*;

public class Lec14Main {
    public static void main(String[] args) {
        try {
            if (args.length == 0 || (args.length % 4 != 0 && args.length % 4 != 3)) {
                throw new IllegalArgumentException("プログラム引数を見直してください");
            }

            int index = 0;
            int personCount = 0;
            for (int i = 0; i < args.length; ) {
                String type = args[i];
                if (type.equals("Teacher")) {
                    i += 3;
                } else if (type.equals("Student")) {
                    i += 4;
                } else {
                    throw new IllegalArgumentException("不正なクラス指定です: " + type);
                }
                personCount++;
            }

            Person[] persons = new Person[personCount];
            index = 0;

            for (int i = 0; i < persons.length; i++) {
                String type = args[index];
                String name = args[index + 1];
                int age;
                try {
                    age = Integer.parseInt(args[index + 2]);
                } catch (NumberFormatException e) {
                    System.out.println("年齢が正しく入力されていません");
                    return;
                }

                if (type.equals("Teacher")) {
                    Teacher t = new Teacher();
                    t.setValues(name, age);
                    persons[i] = t;
                    index += 3;
                } else if (type.equals("Student")) {
                    String studyType = args[index + 3];
                    Study study;
                    switch (studyType) {
                        case "Programming":
                            study = new Programming();
                            break;
                        case "English":
                            study = new English();
                            break;
                        case "Science":
                            study = new Science();
                            break;
                        default:
                            throw new IllegalArgumentException("不正なStudyタイプです: " + studyType);
                    }
                    Student s = new Student();
                    s.setValues(name, age);
                    s.setStudy(study);
                    persons[i] = s;
                    index += 4;
                } else {
                    System.out.println("不正なクラス指定です: " + type);
                    return;
                }
            }

            for (Person person : persons) {
                person.printInfo();
            }
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

