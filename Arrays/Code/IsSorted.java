public class IsSorted {

    public static void main(String[] args) {

        int[] arr = { 20, 20, 45, 89, 89, 90 };
        int j = 1, no = 0;

        while (j < arr.length) {
            if (arr[j - 1] <= arr[j]) {
                j++;
            } else {
                no = -1;
                break;
            }
        }
        if (no == -1)
            System.out.println("Not Sorted");
        else
            System.out.println("Sorted");
    }
}
