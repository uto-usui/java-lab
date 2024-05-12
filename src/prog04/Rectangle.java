package prog04;

// issue04.Rectangleクラス
public class Rectangle {
    // フィールド
    int width;  // 幅
    int height; // 高さ

    // コンストラクタ
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // メソッド
    public String toString() {
        return "[" + width + ", " + height + "]";
    }

    // 動作確認用のmainメソッド
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(123, 45);
        System.out.println(rect1.toString());

        Rectangle rect2 = new Rectangle(80, 60);
        System.out.println(rect2.toString());
    }
}
