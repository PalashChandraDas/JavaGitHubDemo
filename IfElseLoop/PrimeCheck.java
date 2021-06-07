package basic_exercise;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = in.nextInt();
        int count = 0;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.printf("%d is prime number.\n", num);
        } else {
            System.out.printf("%d is composite number.\n", num);
        }
    }
}
