package Array_Exercise;

public class FindDuplicateValues {

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 10, 4, 5, 20};

        System.out.println("Duplicate Element: ");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && (i != j)) {
                    System.out.println(array[j]);

                }
            }
        }
    }
}
