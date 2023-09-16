public class Max {

    public static void main(String[] args) {

        int[] arr = { 45, 23, 6, 8, 96 };
        System.out.println(maxRange(arr, 2, 4));
    }

    static int maxRange(int[] arr, int start, int end) {
        if (start > end)
            return -1;

        if (arr == null)
            return -1;

        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static int max(int[] b) {
        if (b.length == 0) {
            return 0;
        }
        int max = b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i] > max)
                max = b[i];
        }
        return max;
    }
}
