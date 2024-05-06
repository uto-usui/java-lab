package prog02;

public class Issue04 {
    public static void main(String[] args) {
        int a = 10; // 正の整数で初期化
        int count = 0;

        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.println("1から" + a + "までの偶数の数は" + count + "です。");
        System.out.println("Count="+count);
    }
}
