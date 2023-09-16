import java.util.Arrays;

public class ConstantDuplicate {

    public static void main(String[] args) {
        int[] nums = { 5,1,2,3,4,2};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                    System.out.print(nums[i] + " ");
            }
        }
    }
}
