package basic_exercise;

public class CountDigitVowelConsonant {

    public static void main(String[] args) {
        String line = "This language is aw3som3.";
        line = line.toLowerCase();//string convert to small letter
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("consonants: " + consonants);
        System.out.println("digits: " + digits);
        System.out.println("spaces: " + spaces);

    }
}
