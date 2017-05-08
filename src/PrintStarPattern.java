/**
 * Created by khimin on 06.05.17.
 */
public class PrintStarPattern {
    public static void main(String[] args) {
//          *
//        *  *
//       *  *  *
//     *  *  *  *
//   *   *  *  *  *
        for (int i = 1; i <= 5; i++) {

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
//*
//* *
//* * *
//* * * *
// * * * * *
        int i, j;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

//* * * * *
//* * * *
//* * *
//* *
//*
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
