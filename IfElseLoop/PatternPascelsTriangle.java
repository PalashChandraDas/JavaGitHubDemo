package basic_exercise;

public class PatternPascelsTriangle {

    public static void main(String[] args) {
        int c = 1;
        for (int i = 0; i < 6; i++) {//i=row
            for (int space = 1; space <= 6 - i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {//j=col
                if (i == 0 || j == 0) {
                    c = 1;
                }else {
                    c = c * (i - j + 1) / j;// like formula
                }
                System.out.print(" " + c);
            }
            System.out.println();
        }
    }
}
