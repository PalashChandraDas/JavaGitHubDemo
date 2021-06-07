package basic_exercise;

public class Pattern {

    public static void main(String[] ars) {
        for (int row = 3; row >= 1; row--) {
            for (int space = 1; space <= 3 - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            for (int col = row - 1; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
