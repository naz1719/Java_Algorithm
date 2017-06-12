/**
 * Created by khimin on 17.05.17.
 */
public class Main {
    public static void main(String[] args) {
        new Main().printNos(10);
    }

    void printNos(int n) {
        if (n > 0) {
            printNos(n - 1);
            System.out.printf("%d ", n);
        }
    }
}
