package prog11_3;

// 加算を実装するクラス
class Sum implements Calc {
    public String getOperator() {
        return "+";
    }

    public int calc(int a, int b) {
        return a + b;
    }
}
