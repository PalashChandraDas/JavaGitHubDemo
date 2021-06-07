package basic_exercise;

public class PalindromeMtoN {

    public static void main(String[] args) {
        int num = 50;
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            for (int temp = i; temp != 0; temp = temp / 10) {//(temp!=0) means (temp>0)
                int r = temp % 10;
                sum = sum * 10 + r;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
