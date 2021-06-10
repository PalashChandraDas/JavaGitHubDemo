package IfElseLoop;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter Fahrenheit value: ");
        double F = in.nextDouble();
        double C = ((F - 32) * 5) / 9;
        System.out.printf("%f degree celsius.\n", C);
    }
}
