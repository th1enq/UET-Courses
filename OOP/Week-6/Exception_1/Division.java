public class Division extends BinaryExpression {
    /**
     * haha.
     *
     * @param left hihi
     * @param right hihi
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * haha.
     *
     * @return hihi
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    /**
     * haha.
     *
     * @return hihi
     */
    @Override
    public double evaluate() {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return left.evaluate() / right.evaluate();
    }
}
