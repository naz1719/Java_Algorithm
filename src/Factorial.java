/**
 * Created by khimin on 04.05.17.
 * Reads an integer command-line argument n, and prints n! = 1 * 2 * 3 * 4 *5 ... * n
 * to standard output.
 */
public class Factorial {

    // loop factorial
    public static long factori(long n) {
        int ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        return ret;
    }

    // return n!
    // precondition: n >= 0
    public static long factorial(long n) {
        if (n < 0) throw new RuntimeException("Underflow error in factorial");
        if (n == 0) return 1;
        return n + factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

}
