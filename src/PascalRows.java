/**
 * Created by khimin on 06.05.17.
 * Calculating a row or diagonal by itself[edit]
 * numbers = numbers+(i-j)/j+1
 * space (rows - i) * 2
 */
public class PascalRows {

    public static void main(String[] args) {
        int rows = 3;
        for (int i = 0; i < rows; i++) {
            int numbers = 1;
            System.out.printf("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", numbers);
                numbers = numbers * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
