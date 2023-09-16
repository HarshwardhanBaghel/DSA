// package Babbar;
public class FindUnique {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,8};
        System.out.println(singleNumber(arr));
    }
    static public int singleNumber(int[] nums) {
        int unique =0;

        for(int i : nums)
        {
            unique = unique^i;
        }
        return unique;
    }
}
