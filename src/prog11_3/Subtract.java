package prog11_3;

// 減算を実装するクラス
public class Subtract implements Calc {
    public String getOperator() {
        return "-";
    }

    public int calc(int a, int b) {
        return a - b;
    }
}
