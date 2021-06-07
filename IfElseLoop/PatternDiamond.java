package basic_exercise;

public class PatternDiamond {

    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            for (int space = 1; space <= 4 - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int col = row - 1; col >= 1; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int row = 3; row >= 1; row--) {
            for (int space = 1; space <= 4 - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int col = row - 1; col >= 1; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

}
