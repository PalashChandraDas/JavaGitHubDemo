package Array_Exercise;

public class FindIndex {

    public static int IndexOf(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return - 1; //no value of index
    }

    public static void main(String[] args) {

        int[] array = {12, 22, 20, 10, 5, 20};
        System.out.println(IndexOf(array, 20));
        System.out.println(IndexOf(array, 11));

    }

}
