/**
 * Created by khimin on 06.05.17.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if ((i % 3) == 0 && (i % 5) == 00) {
                System.out.println("FizzBuzz");
            } else System.out.println(i);
        }
    }
}