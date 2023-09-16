
import java.util.Arrays;

public class SwapAlternate {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 10 };
        swapAlternate1(arr);
    }

    static void swapAlternate1(int[] arr) {
        int j = 0;
        while(j+1 < arr.length ) {
            int temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp;
            System.out.print(arr[j] + " " + arr[j+1]+" ");
            j += 2;
        }
        // System.out.println(Arrays.toString(arr));
    }
}
