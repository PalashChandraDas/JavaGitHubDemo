import java.util.Scanner;
public class Ascending {
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.printf("Enter %d values in the array: ", n);
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        bubble_sort(arr, n);
    }

    static void bubble_sort(int[] arr, int n) {
        int i, j, temp;
        for(i = 0; i < n - 1; i++) {
            for(j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted Ascending order: ");
        for(i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
