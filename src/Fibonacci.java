/**
 * Created by khimin on 04.05.17.
 * In mathematics, the Fibonacci numbers are the numbers in the following integer sequence,
 * called the Fibonacci sequence, and characterized by the fact that every number after the first two is the sum of the two preceding ones:[1][2]
 * 0	1	1	2	3	5	8	13	21	34	55.
 * The Rule is xn = xn-1 + xn-2
 */
public class Fibonacci {
    public static long fibonacci(int n) {
        if (n <= 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
    }
}