package basic_exercise;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Character:");
        char Char = in.next().charAt(0);

        if (Char == 'a' || Char == 'e' || Char == 'i' || Char == 'o' || Char == 'u'
                || Char == 'A' || Char == 'E' || Char == 'I' || Char == 'O' || Char == 'U') {
            System.out.printf("%c is vowel\n", Char);
        } else {
            System.out.printf("%c is consonant\n", Char);
        }
    }

}
