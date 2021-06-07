package basic_exercise;

import java.util.Scanner;

public class SampleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int a, b, c, temp;
        a = x;
        b = y;
        c = z; // a=4 b=9 c=0

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;// b=0
            c = temp;// c=9
        }
        if (a > b) {
            temp = a;
            a = b; // a=0
            b = temp;// b=4
        }
        System.out.printf("Ascending order:%d %d %d\n", a, b, c);
    }
}
