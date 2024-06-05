package prog11_3;

// 除算を実装するクラス
class Divide implements Calc {
    public String getOperator() {
        return "/";
    }

    public int calc(int a, int b) {
        return a / b;
    }
}
