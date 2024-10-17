public class Numeral extends Expression {
    private double value;

    public Numeral() {

    }

    /**
     * haha.
     *
     * @param value hihi
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    @Override
    public String toString() {
        if (value == Math.floor(value)) {
            return Integer.toString((int) value);
        }
        return value + "";
    }

    /**
     * haha.
     *
     * @return hihi
     */
    @Override
    public double evaluate() {
        return value;
    }
}
