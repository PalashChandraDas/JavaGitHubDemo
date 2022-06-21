class Fibonacci {
    public static void main(String[] args) {

        int firstTerm = 0, secTerm = 1, nextTerm, N = 15, i = 1;

        while(i <= N){
            System.out.print(firstTerm + " ");
            
            nextTerm = firstTerm + secTerm;
            firstTerm = secTerm;
            secTerm = nextTerm;
            
            i++;
        }

    }
}
