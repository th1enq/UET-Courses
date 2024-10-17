public abstract class Shape {
    protected String color;
    protected boolean filled;
    protected static final double PI = Math.PI;

    public Shape() {

    }

    /**
     * haha.
     *
     * @param color hihi
     * @param filled hihi
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String getColor() {
        return this.color;
    }

    /**
     * haha.
     *
     * @param color hihi
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public boolean isFilled() {
        return this.filled;
    }

    /**
     * haha.
     *
     * @param filled hihi
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }
}
