package prog08;

public abstract class Vector {
    private int dimension;
    private double[] elements;

    public Vector() {
        this.dimension = 2;
        this.elements = new double[dimension];
    }

    public Vector(int dimension) {
        this.dimension = dimension;
        this.elements = new double[dimension];
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
        this.elements = new double[dimension];
    }

    public double getElement(int i) {
        return elements[i];
    }

    public void setElement(int i, double e) {
        elements[i] = e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < dimension; i++) {
            sb.append(elements[i]);
            if (i < dimension - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public abstract double innerProduct(Vector v);

    public abstract Vector scalarMultiplication(double scalar);

    public abstract Vector addVector(Vector v);
}
