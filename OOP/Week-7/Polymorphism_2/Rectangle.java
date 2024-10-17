import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

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
     * @param topLeft hihi
     * @param width hihi
     * @param length hihi
     * @param color hihi
     * @param filled hihi
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
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
    public Point getTopLeft() {
        return this.topLeft;
    }

    /**
     * haha.
     *
     * @param topLeft hihi
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
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
        return "Rectangle[topLeft=" + topLeft.toString() + ",width=" + Math.round(width * 10) / 10.0
                + ",length=" + Math.round(length * 10) / 10.0 + ",color=" + color + ",filled="
                + filled + "]";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Rectangle current = (Rectangle) other;
        return Math.abs(current.width - width) == 0 && Math.abs(current.length - length) == 0
                && Objects.equals(this.topLeft, current.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, topLeft);
    }
}
