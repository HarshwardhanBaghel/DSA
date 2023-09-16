public class CelingofNumber {

    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceilSearch(arr,target);
        System.out.println(arr[ans]);
    }

    static  int ceilSearch(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start <= end)
        {
            int middle =  start + (end - start) / 2;
            if(target > arr[middle])
            {
                start = middle+1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            }else{
                return middle;
            }
        }
        return start;
    }
}
