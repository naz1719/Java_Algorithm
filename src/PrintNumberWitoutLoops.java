/**
 * Created by khimin on 09.06.17.
 */
public class PrintNumberWitoutLoops {
    public static void main(String[] args) {
     printNumbers(10);
    }
    static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.printf("%d ", n);
        }
    }
}
