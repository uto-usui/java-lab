package prog11_3;

// 乗算を実装するクラス
class Multiply implements Calc {
    public String getOperator() {
        return "x";
    }

    public int calc(int a, int b) {
        return a * b;
    }
}
