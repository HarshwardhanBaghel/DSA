
import java.util.Scanner;

public class fib {
    
    public static void main(String[] args) {
        
        int a=0,b=1,n=0,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        System.out.print("0,1");
        for(int i = 0;i<n-1;i++)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.print(","+a);

        }
        System.out.println();
        if(n==1)
        {
            System.out.println(1);
        }else{
            System.out.println("Sum is : "+c);
        }
        sc.close();
    }
}
