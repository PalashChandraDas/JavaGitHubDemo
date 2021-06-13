package Array_Exercise;

import java.util.Scanner;

public class InsertElement {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter 5 int values: ");
        int[] array = new int[6];//maximum 6 store values this array;
        int index = 3;
        int value = 100;

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = in.nextInt();
        }
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }

        System.out.print("After inserted array: ");
        array[index] = value;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
