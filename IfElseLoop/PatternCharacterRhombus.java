package basic_exercise;

public class PatternCharacterRhombus {

    public static void main(String[] args) {
        int ch = 65;

        for (int row = 0; row < 5; row++) {
            for (int space = 1; space <= 20 - row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print((char) (ch + col));
            }
            for (int col = row - 1; col >= 0; col--) {
                System.out.print((char) (ch + col));
            }
            System.out.println();
        }

        for (int row = 3; row >= 0; row--) {
            for (int space = 1; space <= 20 - row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print((char) (ch + col));
            }
            for (int col = row - 1; col >= 0; col--) {
                System.out.print((char) (ch + col));
            }
            System.out.println();
        }

    }
}
