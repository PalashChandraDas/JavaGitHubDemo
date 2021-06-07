package basic_exercise;

public class DigitCount {

    public static void main(String[] args) {
        int num = 20;
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
