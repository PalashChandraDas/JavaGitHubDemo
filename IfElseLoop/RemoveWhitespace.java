package basic_exercise;

public class RemoveWhitespace {

    public static void main(String[] args) {
        
        String name = "Palash Chandra    Das";
        name = name.replaceAll("\\s", "");
        
        System.out.println(name);
    }
}
