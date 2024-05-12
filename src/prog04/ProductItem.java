package prog04;

// issue03
public class ProductItem {
    String name; // 名前
    int price; // 価格

    // コンストラクタ
    public ProductItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "[" + name + ", " + price + "]";
    }

    public static void main(String[] args) {
        ProductItem item = new ProductItem("Apple", 100);
        System.out.println(item.toString());
    }
}


