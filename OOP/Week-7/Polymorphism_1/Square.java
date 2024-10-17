public class Square extends Rectangle {
    public Square() {

    }

    /**
     * haha.
     *
     * @param side hihi
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * haha.
     *
     * @param side hihi
     * @param color hihi
     * @param filled hihi
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public double getSide() {
        return super.width;
    }

    /**
     * haha.
     *
     * @param side hihi
     */
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[side=" + Math.round(length * 10) / 10.0 + ",color=" + super.color
                + ",filled=" + super.filled + "]";
    }
}
