package basic_exercise;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:");
        int number, temp, r, sum = 0;
        number = in.nextInt();
        temp = number;

        while (temp != 0) {
            r = temp % 10;
            sum = sum + (r * r * r);
            temp /= 10;
        }
        if (number == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }

    }

}
