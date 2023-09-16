import java.util.Arrays;

public class BubbleSort{

    public static void main(String[] args) {
        
        int[] arr = {-1,7,-32,0,89};
        boolean swap;
        for(int i=0;i<arr.length;i++)
        {
            swap = false;
            for(int j=1;j<=(arr.length-1)-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if(swap == false)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}