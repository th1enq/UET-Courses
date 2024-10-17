public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.14;

    /**
     * Constructor for the Circle class.
     *
     */
    public Circle() {

    }

    /**
     * Constructor for the Circle class.
     *
     * @param radius 123
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor for the Circle class.
     *
     * @param radius 123
     * @param color 123
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Gets the radius of the Circle.
     *
     * @return
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Sets the radius of the Circle.
     *
     * @param radius 123
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the color of the Circle.
     *
     * @return
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Sets the color of the Circle.
     *
     * @param color 123
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the area of the Circle.
     *
     * @return
     */
    public double getArea() {
        return PI * this.radius * this.radius;
    }

    /**
     * Gets the circumference of the Circle.
     *
     * @return
     */
    public String toString() {
        return "Circle[radius=" + this.radius + ",color=" + this.color + "]";
    }
}
