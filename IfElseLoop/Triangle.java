package basic_exercise;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The value of a, b, c = ");
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();

        if (a != 0 && b != 0 && c != 0 && (a + b) > c && (b + c) > a && (c + a) > b) {
            System.out.println("This is Triangle.");
        } else {
            System.out.println("Oh! Not Triangle.");
        }

    }
}
