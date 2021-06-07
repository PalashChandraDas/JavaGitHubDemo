package basic_exercise;

import java.util.Scanner;

public class IsoscelesTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The length of equal arms (meter):");
        double a = in.nextDouble();
        System.out.print("The length of other arm (meter):");
        double b = in.nextDouble();

        double area = (b * Math.sqrt(a * a - b * b)) / 4.0;
        System.out.printf("The area of Isosceles triangle is:%.3f m^2\n", area);
    }

}
