public class Square extends Expression {
    private Expression expression;

    /**
     * haha.
     *
     * @param expression hihi
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    @Override
    public String toString() {
        return "(" + expression.toString() + ")" + " ^ 2";
    }

    /**
     * haha.
     *
     * @return hihi
     */
    @Override
    public double evaluate() {
        return Math.pow(expression.evaluate(), 2);
    }
}
