public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {

    }

    /**
     * haha.
     *
     * @param width hihi
     * @param length hihi
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * haha.
     *
     * @param width hihi
     * @param length hihi
     * @param color hihi
     * @param filled hihi
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * haha.
     *
     * @param width hihi
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public double getLength() {
        return this.length;
    }

    /**
     * haha.
     *
     * @param length hihi
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public double getArea() {
        return width * length;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + Math.round(width * 10) / 10.0 + ",length="
                + Math.round(length * 10) / 10.0 + ",color=" + super.color + ",filled="
                + super.filled + "]";
    }
}
