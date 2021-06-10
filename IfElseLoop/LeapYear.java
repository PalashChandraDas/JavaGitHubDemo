package IfElseLoop;

public class LeapYear {

    public static void main(String[] args) {
        int year = 1900;

        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.printf("%d is leap year.\n", year);
        } else {
            System.out.printf("%d is not leap year.\n", year);
        }

    }
}
