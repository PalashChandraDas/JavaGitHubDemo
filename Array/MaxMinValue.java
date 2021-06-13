package Array_Exercise;

public class MaxMinValue {

    public static void main(String[] args) {
        int[] num = {44, 12, 19, 10, 50};

        int maxValue = num[0];
        int minValue = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > maxValue) {
                maxValue = num[i];
            }
            if (num[i] < minValue) {
                minValue = num[i];
            }
        }
        System.out.println("Maximum value in array: " + maxValue);
        System.out.println("Minimum value in array: " + minValue);
    }
}
