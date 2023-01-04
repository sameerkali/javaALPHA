package Recursion;

public class fibanacci {
    public static int Fib (int num) {

        if(num == 0 || num == 1) {
            return num;
        }
        return Fib(num-1) + Fib(num-2);
    }
    public static void main (String[] args) {
        int num = 10;
        System.out.println(Fib(num));
    }
}
