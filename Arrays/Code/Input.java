import java.util.Arrays;
import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] ar = new String[3];

        for(int i=0;i<ar.length;i++)
        {
            ar[i] = sc.next();
        }

        System.out.println(Arrays.toString(ar));
        // System.out.println(ar);
    }
}
