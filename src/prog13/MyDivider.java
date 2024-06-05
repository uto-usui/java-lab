package prog13;

class MyDividerException extends Exception {
    public MyDividerException(String message) {
        super(message);
    }
}

public class MyDivider {
    // 引数を割り算するメソッド
    public static int divide(int a, int b) throws MyDividerException {
        if (b == 0) {
            throw new MyDividerException("0で割ろうとしたので例外が発生しました");
        }
        return a / b;
    }

    // 動作確認用mainメソッド
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("usage: MyDivider a b");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = divide(a, b);
            System.out.println(a + " / " + b + " = " + result);
        } catch (MyDividerException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("引数は整数でなければなりません。");
        }
    }
}

