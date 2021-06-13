package Array_Exercise;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] array = {35, 40, 45, 50, 55, 60};
        int[] arr = new int[array.length - 1];// 5 values stored
        System.out.println("Before: " + Arrays.toString(array));

        int Index = 3;
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i != Index) {
                arr[k] = array[i];
                k++;
            }
        }

        System.out.print("After remove: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
