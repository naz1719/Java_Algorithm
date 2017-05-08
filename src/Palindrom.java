/**
 * Created by khimin on 06.05.17.
 */
public class Palindrom {
    public static void main(String[] args) {
        int pali = 121;
        int pali1 = pali;
        int reverse = 0;
        while (pali > 0) {
            int tmp = pali % 10;
            reverse = reverse * 10 + tmp;
            pali = pali / 10;
        }
        if (pali1 == reverse) {
            System.out.println("palindtom");
        } else {
            System.out.println("Isn't palindrom");
        }
    }
}
