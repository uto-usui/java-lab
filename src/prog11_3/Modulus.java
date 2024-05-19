package prog11_3;

// 剰余を実装するクラス
public class Modulus implements Calc {
    public String getOperator() {
        return "%";
    }

    public int calc(int a, int b) {
        return a % b;
    }
}
