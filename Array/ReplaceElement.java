package Array_Exercise;

public class ReplaceElement {

    public static void main(String[] args) {

        String[] name = {"Kamal", "Palash", "Monni", "Krishna", "Shimul"};

        name[2] = "Jakir";//replace value of index 2
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }
        System.out.println();
    }
}
