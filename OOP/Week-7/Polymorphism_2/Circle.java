import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

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
     * @param center hihi
     * @param radius hihi
     * @param color hihi
     * @param filled hihi
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
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
    public Point getCenter() {
        return this.center;
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
        return "Circle[center=" + center.toString() + ",radius=" + Math.round(radius * 10) / 10.0
                + ",color=" + color + ",filled=" + filled + "]";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Circle current = (Circle) other;
        return Math.abs(current.radius - this.radius) == 0
                && Objects.equals(current.center, this.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, center);
    }
}
