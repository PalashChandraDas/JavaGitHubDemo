package basic_exercise;

public class Alphabet {

    public static void main(String[] args) {
        //ASCII value: A to Z(65-90), a to z(97-122)
        System.out.println("Capital letter:");
        for (char i = 65; i <= 90; i++) {
            System.out.printf("%c ", i);
        }
        System.out.println();
    }

}
