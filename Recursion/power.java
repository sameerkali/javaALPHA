package Recursion;

// public class power {
//     public static int Power(int x, int n) {
//         if(n == 0) return 1;
//         return x * Power(x, n-1);
//     }
//     public static void main (String[] args) {
//         System.out.println(Power(2, 10));
//     }
    
// }


// optimized power

public class power {
    public static int PowerOptimized(int x, int n) {
        if(n == 0) return 1;

        int halfPower = PowerOptimized(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0)  return x * halfPowerSq;
        return halfPowerSq;
    }
    public static void main (String[] args) {
        System.out.println(PowerOptimized(2, 10));
    }
    
}