import java.util.Arrays;

/**
 * Created by khimin on 05.05.17.
 */
public class ArrayOperations {
    public static void main(String[] args) {
        int array[] = new int[]{6, 5, 8, 7, 1, 1, 7};
        max(array);
        average(array);
        reverse(array);
        int number =12345;
        intreverse(number);
    }
    static void twomax(int array[]) {
        int maxOne = array[0];
        int maxTwo = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (maxOne < array[i]) {
                maxTwo = maxOne;
                maxOne = array[i];
            } else if (maxTwo < array[i]) {
                maxTwo = array[i];
            }
        }
        System.out.println("First Maximum Number: " + maxOne);
        System.out.println("Second Maximum Number: " + maxTwo);
    }
    static void intreverse(int number){
        int reversedNumber =0;

        while (number>0){
            int temp = number%10;
            reversedNumber=reversedNumber*10 +temp;
            number=number/10;
        }

        //output the reversed number
        System.out.println("Reversed Number is: " + reversedNumber);
    }
    //    THE maximum of array
    static void max(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
    }

    // Average
    static void average(int array[]) {
        int N = array.length;
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += array[i];
        }
        double average = sum / N;
    }

    // copy to another array
    static void copyToAnotherArray(int array[]) {
        int N = array.length;
        double[] b = new double[N];
        for (int i = 0; i < N; i++) {
            b[i] = array[i];
        }
    }

    // reverse the elements within elements

    static void reverse(int a[]) {
        int N = a.length;
        for (int i = 0; i < N /2; i++) {
            int tmp = a[i];
            a[i] = a[N - 1 - i];
            a[N - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
