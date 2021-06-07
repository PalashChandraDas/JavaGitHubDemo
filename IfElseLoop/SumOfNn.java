package basic_exercise;

public class SumOfNn {

    public static void main(String[] args) {
        int sum = 0;
        for (int base = 1; base <= 5; base++) {
            int temp = 1;
            for (int power = 1; power <= base; power++) {
                temp = temp * base;
            }
            sum += temp;
//            System.out.println(temp);
        }
        System.out.println("Sum = "+sum);
    }
}
