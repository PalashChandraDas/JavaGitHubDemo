import java.util.Scanner;
class AscendingNum {
    public static void main(String[] args) {

        int i, j, n;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        n = in.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter some numbers in array: ");
        for(i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        ascending_order(arr, n); //calling function here
        
    }
    
    
    static void ascending_order(int[] arr, int n){
        //using bubble_sort
        int i, j, temp;
        for(i = 0; i < n; i++){
            for(j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    //swapping_here
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        System.out.print("Sorted Ascending order: ");
        for(i = 0; i < n; i++){
             System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
