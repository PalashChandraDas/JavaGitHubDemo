package basic_exercise;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number/string:");
        String s1 = in.nextLine();
        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();

        if (s1.equals(s2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Plindrome");
        }

    }
}
