import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FindUniquOccur {

    public static void main(String[] args) {
        int[] arr = { 26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(uniqueOccurrences(arr));
    }

    static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        while(i<arr.length)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }else{
                    break;
                }    
            }
            list.add(count);
            i+=count;
        }
        for(i=0;i<list.size()-1;i++)
        {
            list.sort(Comparator.naturalOrder());
            if(list.get(i) == list.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
}
