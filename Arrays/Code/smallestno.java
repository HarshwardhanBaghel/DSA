public class smallestno {

    public static void main(String[] args) {
        int[] arr = { 12, 13, 1, 10, 34, 1 };
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("smallest element is: "+ smallest);

        int second_smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < second_smallest
                    && arr[i] > smallest) {
                second_smallest = arr[i];
            }
        }
        System.out.println("second smallest element is: "+ second_smallest);
    }
}
