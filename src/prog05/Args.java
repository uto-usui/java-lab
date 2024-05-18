package prog05;

public class Args {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("コマンドライン引数はありません");
            return;
        }

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
