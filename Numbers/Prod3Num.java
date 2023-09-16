public class Prod3Num {

    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        int[] x = { 0 };
        if (nums.length >= 3) 
        {
            int a = 0, b = 2;
            while (b < nums.length)
             {
                int max = maximumProduct(nums, a, b);
                if (max < x[0]) {
                    x[0] = max;
                } else if(max > x[0]){
                    x[0] = max;
                }else{
                    x[0] = x[0];
                }
                a++;
                b++;
            }
            if(b==nums.length)
            {
                b = 0;
                while(a!=0 && b!=2)
                {
                    int max = maximumProduct(nums, a, b);
                    if (max < x[0]) {
                        x[0] = max;
                    } else if(max > x[0]){
                        x[0] = max;
                    }else{
                        x[0] = x[0];
                    }
                    a++;
                    b++;
                }
            }
            System.out.println(x[0]);
        }else{
            System.out.println(-1);
        }

    }

    static int maximumProduct(int[] nums, int start, int end) {

        int m = 1;
        for (int i = start; i <= end; i++) {
            m = nums[i] * m;
        }
        return m;
    }
}
