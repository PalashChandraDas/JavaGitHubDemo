package Array_Exercise;

import java.util.Arrays;

public class CopyArray {
    
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 77};
        int[] new_array = new int[array.length];//contains 5 values

        for (int i = 0; i < array.length; i++) {
            new_array[i] = array[i];
        }
        System.out.println("Copied Array: " + Arrays.toString(new_array));
    }
}
