public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * haha.
     *
     * @param center hihi
     * @param radius hihi
     */
    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public double getRadius() {
        return radius;
    }

    /**
     * haha.
     *
     * @param radius hihi
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public Point getCenter() {
        return center;
    }

    /**
     * haha.
     *
     * @param center hihi
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * haha.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * haha.
     */
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * haha.
     */
    public String getInfo() {
        return "Circle[(" + String.format("%.2f", center.getPointX()) + ","
                + String.format("%.2f", center.getPointY()) + "),r=" + String.format("%.2f", radius)
                + "]";
    }
}
