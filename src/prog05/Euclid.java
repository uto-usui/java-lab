package prog05;

public class Euclid {
    public static int euclidean(int a, int b) {
        // a < b ならば a, b を入れ替える
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // b ≠ 0 の間、次の処理を繰り返す
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        // a を返す
        return a;
    }


    public static int euclideanRecursive(int a, int b) {
        // a < b ならば a, b を入れ替える
        if (a < b) {
            return euclideanRecursive(b, a);
        }

        // b = 0 ならば a を返す
        if (b == 0) {
            return a;
        }

        // 再帰呼び出し
        return euclideanRecursive(b, a % b);
    }

    public static void main(String[] args) {
        // コマンドライン引数が2つ未満の場合はエラーメッセージを表示して終了
        if (args.length < 2) {
            System.out.println("Usage: java Euclid <number1> <number2>");
            return;
        }

        // コマンドライン引数を整数に変換
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // euclidean メソッドを呼び出して最大公約数を計算
        int gcd = euclidean(a, b);

        // euclideanRecursive メソッドを呼び出して最大公約数を計算
        int gcdRecursive = euclideanRecursive(a, b);

        // 結果を出力
        System.out.println("GCD of " + a + " and " + b + " (iterative): " + gcd);
        System.out.println("GCD of " + a + " and " + b + " (recursive): " + gcdRecursive);
    }
}
