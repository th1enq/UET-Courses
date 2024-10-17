public class Multiplication extends BinaryExpression {
    /**
     * haha.
     *
     * @param left hihi
     * @param right hihi
     */
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * haha.
     *
     * @return hihi
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }

    /**
     * haha.
     *
     * @return hihi
     */
    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
