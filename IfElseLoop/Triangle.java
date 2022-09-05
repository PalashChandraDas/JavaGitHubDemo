import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        System.out.print("Enter the the value of a, b & c: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            double S = (a + b + c) / 2.0;
            double Area = Math.sqrt(S * (S - a) * (S - b) * (S - c));
            System.out.printf("The area of triangle is: %.3f\n", Area);
        } else {
            System.out.println("Triangle is not possible.");
        }
    }
}
