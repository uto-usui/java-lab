package prog08;

public class PointMain {
    public static void main(String[] args) {
        double x = 2;
        double y = 3;
        double z = 4;
        Point2D p2 = new Point2D(x, y);
        System.out.println("p2 = " + p2);
        System.out.println("|p2| = " + p2.getDistance());
        Point3D p3 = new Point3D(x, y, z);
        System.out.println("p3 = " + p3);
        System.out.println("|p3| = " + p3.getDistance());
    }
}
