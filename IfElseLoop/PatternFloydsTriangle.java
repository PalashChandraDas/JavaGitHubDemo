
package basic_exercise;

public class PatternFloydsTriangle {
    public static void main(String[] args){
        int k = 1;
        for(int row = 1; row <= 4; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(k++);
            }
            System.out.println();
        }
    }
}
