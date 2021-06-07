package basic_exercise;

import java.util.Scanner;

public class PowerN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("base = ");
        int base = in.nextInt();
        System.out.print("power = ");
        int power = in.nextInt();
        int temp = 1;

        for (int i = 1; i <= power; i++) {
            temp *= base;
        }
        System.out.printf("The result of %d^%d = %d\n", base, power, temp);

    }
}
