package basic_exercise;

import java.util.Scanner;

public class PrimeN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter nth number:");
        int num = in.nextInt();
        int i, j;

        for (i = 1; i <= num; i++) {
            int count = 0;
            if (i > 1) {
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
