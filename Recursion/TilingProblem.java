package Recursion;

public class TilingProblem {
    public static int tile (int n) {
        // Base Case
        if (n == 0 || n == 1) return 1;
         
        // Vertical Choice 
        int fnm1 = tile(n-1);
        //Horizental Choice 
        int fnm2 = tile(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main (String[] args) {
        System.out.println(tile(5));
    } 
}
