public class Cylinder extends Circle {
    private double height;

    /**
     * Constructor for the Cylinder class.
     *
     *
     */
    public Cylinder() {
        super();
    }

    /**
     * Constructor for the Cylinder class.
     *
     * @param radius 12312312
     */
    public Cylinder(double radius) {
        super(radius);
    }

    /**
     * Constructor for the Cylinder class.
     *
     * @param height 1321321321
     * @param radius 1312312
     */
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    /**
     * Constructor for the Cylinder class.
     *
     * @param height 132132 1
     * @param radius 1312321
     * @param color 131321
     */
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Gets the height of the Cylinder.
     *
     * @return
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Sets the height of the Cylinder.
     *
     * @param height 1231321
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the volume of the Cylinder.
     *
     * @return
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2 * PI * super.getRadius() * (getRadius() + height);
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height=" + height + "]";
    }
}
