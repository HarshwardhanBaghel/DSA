import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        // list.add(102);
        // list.add(54);
        // list.add(56);
        // list.add(18702);
        // list.add(5);
        // list.add(8);
        // list.add(6);
        // list.add(3);

        // System.out.println(list.contains(0));
        // System.out.println(list);
        // list.set(0, 106);
        
        // list.remove(3);
        
        // System.out.println(list);

        for(int i=0;i<5;i++)
            list.add(sc.nextInt());
        
        for(int i=0;i<5;i++)
            System.out.println(list.get(i));
        
        // for(int a : list)
        // {
        //     System.out.println(a);
        // }

            System.out.println(list);
    }
}
