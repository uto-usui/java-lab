package prog04;

public class Square {
    // フィールド
    int side; // 正方形の一辺の長さ

    // コンストラクタ1: 引数を取らずにフィールドsideを整数値10で初期化
    public Square() {
        this.side = 10;
    }

    // コンストラクタ2: 整数値を1つ引数に取り，フィールドsideを初期化
    public Square(int side) {
        this.side = side;
    }

    // メソッド: 正方形インスタンス自身の面積を整数値で返す
    public int getArea() {
        return side * side;
    }

    // 動作確認用のmainメソッド
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println("square1 side: " + square1.side);
        System.out.println("square1 area: " + square1.getArea());

        Square square2 = new Square(5);
        System.out.println("square2 side: " + square2.side);
        System.out.println("square2 area: " + square2.getArea());
    }
}



