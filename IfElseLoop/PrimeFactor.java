package basic_exercise;

public class PrimeFactor {

    public static void main(String[] args) {
        int num = 12;

        for (int i = 2; i < num; i++) {
            while (num % i == 0) {
                System.out.println(i);
                num /= i;
            }
        }
        if (num > 1) {
            System.out.println(num);
        }

    }
}
