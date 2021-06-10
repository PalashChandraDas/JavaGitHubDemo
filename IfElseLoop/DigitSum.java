package IfElseLoop;

import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer value: ");
        int num = in.nextInt();
        int r, temp, sum = 0;
        temp = num;

        while (temp != 0) {
            r = temp % 10;
            sum = sum + r;
            temp /= 10;
        }
        System.out.printf("Sum of digit = %d\n", sum);
    }
}
