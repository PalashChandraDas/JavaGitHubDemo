package basic_exercise;

import java.util.Scanner;

public class GCD_LCM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two integers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int x = a, y = b;

        if (a > 0 && b > 0) {
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            System.out.printf("GCD of %d and %d is = %d\n", x, y, a);
            System.out.printf("LCM of %d and %d is = %d\n", x, y, x * y / a);

        } else {
            System.out.println("Wrong!");
        }
    }
}
