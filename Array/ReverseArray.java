package Array_Exercise;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        String[] name = {"Krishna,", "C++,", "palash,", "Ram,", "C#"};
        Arrays.sort(name);

        System.out.print("Sorted array: ");
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.print(name[i] + " ");
        }
        System.out.println();
    }
}
