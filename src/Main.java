import java.util.Arrays;

/**
 * Created by khimin on 11.05.17.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
    public static  long factorial(long n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }
}
