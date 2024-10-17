public class Circle extends Shape {
    protected double radius;

    public Circle() {

    }

    /**
     * haha.
     *
     * @param radius hihi
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * haha.
     *
     * @param radius hihi
     * @param color hihi
     * @param filled hihi
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public double getRadius() {
        return this.radius;
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
    public double getPerimeter() {
        return radius * PI * 2;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + Math.round(radius * 10) / 10.0 + ",color=" + super.color
                + ",filled=" + super.filled + "]";
    }
}
