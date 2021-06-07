package basic_exercise;

public class MultiplicationTableMtoN {

    public static void main(String[] args) {
        for (int i = 3; i <= 7; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%dx%d=%d\n", i, j, i * j);
            }
            System.out.println();
        }

    }

}
