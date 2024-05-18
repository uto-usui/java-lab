package prog06;

class Rectangle {
    int width;
    int height;

    Rectangle() {
        setSize(0, 0);
    }

    Rectangle(int width, int height) {
        setSize(width, height);
    }

    void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "[" + width + ", " + height + "]";
    }
}

class PlacedRectangle extends Rectangle {
    int x;
    int y;

    PlacedRectangle() {
        super();
        setLocation(0, 0);
    }

    PlacedRectangle(int x, int y) {
        super();
        setLocation(x, y);
    }

    PlacedRectangle(int x, int y, int width, int height) {
        super(width, height);
        setLocation(x, y);
    }

    void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[(" + x + ", " + y + "), " + super.toString() + "]";
    }

    public static void main(String[] args) {
        PlacedRectangle r1 = new PlacedRectangle();
        System.out.println("r1: " + r1);

        PlacedRectangle r2 = new PlacedRectangle(10, 20);
        System.out.println("r2: " + r2);

        PlacedRectangle r3 = new PlacedRectangle(30, 40, 50, 60);
        System.out.println("r3: " + r3);

        r3.setLocation(100, 200);
        System.out.println("r3 after setLocation(100, 200): " + r3);
    }
}
