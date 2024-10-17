import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * haha.
     *
     * @param pointX hihi
     * @param pointY hihi
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public double getPointX() {
        return this.pointX;
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
        return this.pointY;
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
     * @param other hihi
     * @return
     */
    public double distance(Point other) {
        return Math.sqrt(
                Math.pow(other.pointX - this.pointX, 2) - Math.pow(other.pointY - this.pointY, 2));
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Point current = (Point) other;
        return Math.abs(current.pointX - this.pointX) == 0
                && Math.abs(current.pointY - this.pointY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    @Override
    public String toString() {
        return "(" + Math.round(pointX * 10) / 10.0 + "," + Math.round(pointY * 10) / 10.0 + ")";
    }
}
