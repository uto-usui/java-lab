package prog08;

public class ArgsMain {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("usage: java ArgsMain 姓 名");
        } else {
            String lastName = args[0];
            String firstName = args[1];
            System.out.println("こんにちは，" + lastName + " " + firstName);
        }
    }
}
