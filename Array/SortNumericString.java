package Array_Exercise;

import java.util.Arrays;

public class SortNumericString {

    public static void main(String[] args) {
        int[] array1 = {223, 4, 33, 5, 10};
        String[] array2 = {"Java", "Python", "C++", "C#", "C"};

        Arrays.sort(array1);
        String sort1 = Arrays.toString(array1);
        System.out.println("Ascending numeric array: " + sort1);

        Arrays.sort(array2);
        String sort2 = Arrays.toString(array2);
        System.out.println("Ascending string array: " + sort2);
    }
}
