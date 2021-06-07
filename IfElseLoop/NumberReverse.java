package basic_exercise;

public class NumberReverse {

    public static void main(String[] args) {
        int num = 123;
        int r, temp = num;
        int sum = 0;

        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        System.out.println(sum);
    }
}
