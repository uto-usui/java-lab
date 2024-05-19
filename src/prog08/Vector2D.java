package prog08;

public class Vector2D extends Vector {
    public Vector2D() {
        super(2);
    }

    public Vector2D(double x, double y) {
        super(2);
        setElement(0, x);
        setElement(1, y);
    }

    @Override
    public double innerProduct(Vector v) {
        double u0 = getElement(0);
        double u1 = getElement(1);
        double v0 = v.getElement(0);
        double v1 = v.getElement(1);
        return u0 * v0 + u1 * v1;
    }

    @Override
    public Vector scalarMultiplication(double scalar) {
        double x = getElement(0) * scalar;
        double y = getElement(1) * scalar;
        return new Vector2D(x, y);
    }

    @Override
    public Vector addVector(Vector v) {
        double x = getElement(0) + v.getElement(0);
        double y = getElement(1) + v.getElement(1);
        return new Vector2D(x, y);
    }
}
