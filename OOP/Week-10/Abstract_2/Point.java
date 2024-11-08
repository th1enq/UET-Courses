public class Point {
    private double pointX;
    private double pointY;

    /**
     * haha.
     *
     * @param pointX hihi
     * @param pointY hihi
     */
    Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * haha.
     *
     * @param pointX hihi
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * haha.
     *
     * @param pointY hihi
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * haha.
     *
     * @param point hihi
     * @return hihi
     */
    public double distance(Point point) {
        return Math.sqrt(
                Math.pow(pointX - point.getPointX(), 2) + Math.pow(pointY - point.getPointY(), 2));
    }
}
