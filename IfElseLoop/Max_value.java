package basic_exercise;

import java.util.Scanner;

public class Max_value {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int max_value = x;
        if (y > max_value) {
            max_value = y;
        }
        if (z > max_value) {
            max_value = z;
        }
        System.out.println("The greatest number is " + max_value);
    }

}
