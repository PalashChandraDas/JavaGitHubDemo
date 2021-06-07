package basic_exercise;

public class QuadraticEquations {

    public static void main(String[] args) {
        double a = 1.000;
        double b = -296;
        double c = 30;

        double D = b * b - (4 * a * c);

        if (D < 0.0 || a == 0.0) {
            System.out.println("Impossible");
        } else if (D == 0.0) {
            double x = -b / (2 * a);
            System.out.printf("The root is real & equal:%.3f\n", x);
        } else {// D>0
            double x1 = -b + Math.sqrt(D) / (2 * a);
            double x2 = -b - Math.sqrt(D) / (2 * a);
            System.out.printf("Roots are real & unequal:%.3f, %.3f\n", x1, x2);

        }

    }

}
