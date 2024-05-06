package prog02;

public class Issue01 {
    private short count = 0;
    private float average = -7.54f;
    private String name = "teikyo";
    private char splitter = ':';

    public void MyClass() {
        // コンストラクタ
    }

    // ゲッターとセッター
    public short getCount() {
        return count;
    }

    public void setCount(short count) {
        this.count = count;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSplitter() {
        return splitter;
    }

    public void setSplitter(char splitter) {
        this.splitter = splitter;
    }
}
