package Recursion;

public class factorial {
    public static int Recursion(int num) {
        if (num == 0){
            return 1;
        }

        // int nm1 = Recursion(num - 1);
        int sol = num * Recursion(num - 1);
        return sol;
    }

    public static void main (String[] args) {
        int num = 5;
        System.out.println(Recursion(num));
    }
}
