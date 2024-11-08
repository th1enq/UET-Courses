public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * haha.
     *
     * @param p1 hihi
     * @param p2 hihi
     * @param p3 hihi
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.distance(p2) + p2.distance(p3) <= p3.distance(p1)
                || p1.distance(p2) + p3.distance(p1) <= p2.distance(p3)
                || p2.distance(p3) + p3.distance(p1) <= p1.distance(p2)) {
            throw new RuntimeException("");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public Point getP1() {
        return p1;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public Point getP2() {
        return p2;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public Point getP3() {
        return p3;
    }

    /**
     * haha.
     */
    public double getArea() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * haha.
     */
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * haha.
     */
    public String getInfo() {
        return "Triangle[(" + String.format("%.2f", p1.getPointX()) + ","
                + String.format("%.2f", p1.getPointY()) + "),("
                + String.format("%.2f", p2.getPointX()) + ","
                + String.format("%.2f", p2.getPointY()) + "),("
                + String.format("%.2f", p3.getPointX()) + ","
                + String.format("%.2f", p3.getPointY()) + ")]";
    }
}
