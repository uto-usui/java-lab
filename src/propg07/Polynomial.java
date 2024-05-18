package propg07;

public class Polynomial extends Function {
    private final int degree;
    private final double[] coefficients;

    // コンストラクタ
    public Polynomial(double[] coefficients) {
        this.degree = coefficients.length - 1;
        this.coefficients = coefficients;
    }

    // 関数値 f(x)を返すメソッド
    @Override
    public double f(double x) {
        double result = 0;
        for (int i = 0; i <= degree; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    // 多項式を微分して得られる関数を返すメソッド
    @Override
    public Function differentiates() {
        if (degree == 0) {
            return new Polynomial(new double[]{0});
        }

        double[] diffCoefficients = new double[degree];
        for (int i = 1; i <= degree; i++) {
            diffCoefficients[i - 1] = coefficients[i] * i;
        }
        return new Polynomial(diffCoefficients);
    }

    // 多項式の文字列表現を返すメソッド
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = degree; i >= 0; i--) {
            if (coefficients[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(coefficients[i]);
                if (i > 0) {
                    sb.append("x^").append(i);
                }
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        double[] coefficients = {1, 2, 3};
        // p(x) = 3x^2 + 2x + 1
        Polynomial p = new Polynomial(coefficients);
        // p(x) = 3x^2 + 2x + 1 を表示
        System.out.println("p(x) = " + p);
        // p(2) = 17
        System.out.println("p(" + 2 + ") = " + p.f(2));
        // p’(x) = q(x) = 6x + 2
        Function q = p.differentiates();
        // p’(x) = q(x) = 6x + 2 を表示
        System.out.println("q(x) = " + q);
        // q(2) = 14
        System.out.println("q(" + 2 + ") = " + q.f(2));
    }
}

// 1変数関数を表す抽象クラス Function
abstract class Function {
    // 関数値 f(x)を返す抽象メソッド
    abstract public double f(double x);

    // 関数 f(x)を微分して得られる関数を返す抽象メソッド
    abstract public Function differentiates();
}
