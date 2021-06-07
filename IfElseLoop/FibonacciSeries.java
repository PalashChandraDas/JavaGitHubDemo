package basic_exercise;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter nth series:");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.printf("%d %d ", a, b);

        for (int i = 3; i <= n; i++) {
            int fact = a + b;
            a = b;
            b = fact;
            System.out.printf("%d ", fact);
        }
    }
}
