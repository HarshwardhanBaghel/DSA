import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = getDigit(sc.nextInt());
        if (digit == 1)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }

    static int getDigit(int num) {
        int i = 0, n = 1, rem = 0, val = num, orl = num;
        double total = 0;
        while (n != 0) {
            n = num / 10;
            rem = num % 10;
            i++;
            num = n;
        }
        for (int j = 0; j < i; j++) {
            n = val / 10;
            rem = val % 10;
            total = total + (Math.pow(rem, i));
            val = n;
        }
        if (total == orl) {
            return 1;
        }
        return -1;
    }
}