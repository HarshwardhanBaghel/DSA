public class ArraySum {
    
    public static void main(String[] args) {

        int[] arr = {15, 12, 13, 10};
        int j = 0, max = 0;

        while (j < arr.length) {
           max += arr[j]; 
           j++;
        }
        System.out.println(max);
    }
}
