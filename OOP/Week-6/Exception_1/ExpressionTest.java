public class ExpressionTest {
    /**
     * haha.
     *
     * @param args dsskdskksd
     */
    public static void main(String[] args) {
        Expression a = new Subtraction(new Square(new Numeral(10)), new Numeral(3));
        Expression b = new Multiplication(new Numeral(4), new Numeral(3));
        Expression c = new Addition(a, b);
        Expression result = new Square(c);
        System.out.println(result.toString());
        System.out.println(result.evaluate());
    }
}
