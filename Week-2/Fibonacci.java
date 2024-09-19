import java.util.Scanner;

public class Fibonacci {

    /**
     * Calculates the nth Fibonacci number.
     *
     * @param n the position in the Fibonacci sequence
     * @return the nth Fibonacci number, or -1 if n is negative
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }
        long[] fib = new long[(int) n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if (fib[i] < 0) {
                return Long.MAX_VALUE;
            }
        }
        return fib[(int) n];
    }

    /**
     * The main method to execute the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
