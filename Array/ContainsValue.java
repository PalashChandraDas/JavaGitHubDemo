package Array_Exercise;

public class ContainsValue {

    public static boolean contains(int[] arr, int item) {
        for (int i : arr) {
            if (i == item) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array = {1920, 2002, 2021, 2016, 2015};

        System.out.println(contains(array, 2013));
        System.out.println(contains(array, 2015));

    }
}
