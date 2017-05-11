import java.util.Arrays;

/**
 * Created by khimin on 11.05.17.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int whitelist[] = {6, 5, 8, 7, 1, 7};
        int key = 7;
        // sort the array
        Arrays.sort(whitelist);
        // read integer key from standard input; print if not in whitelist
        if (indexOf(whitelist, key) == -1)
            System.out.println(key);
    }

    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
