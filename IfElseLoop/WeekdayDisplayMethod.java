
package IfElseLoop;

import java.util.Scanner;

public class WeekdayDisplayMethod {
    public static String GetDayName(int day){
        String dayName;
        switch(day){
            case 1:  dayName = "Saturday"; break;
            case 2:  dayName = "Sunday"; break;
            case 3:  dayName = "Monday"; break;
            case 4:  dayName = "Tuesday"; break;
            case 5:  dayName = "Wednesday"; break;
            case 6:  dayName = "Thursday"; break;
            case 7:  dayName = "Sunday"; break;
            default:
                 dayName = "Invalid day range!";
        }
        return dayName;
    }
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter day no: ");
        int day = in.nextInt();
        
        System.out.println(GetDayName(day)); 
    } 
}
