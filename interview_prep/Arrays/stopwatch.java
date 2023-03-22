package interview_prep.Arrays;

public class stopwatch {
    /*
     import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.stopwatch(a));
    }
}

class Solution {
    static int stopwatch(int[] a) {
        if (a.length % 2 == 1) {
            System.out.println("still running");
        }
        int time = 0;
        for (int i = 0; i < a.length; i += 2) {
            time += a[i + 1] - a[i];
        }
        return time;
    }
}

     */



//////////////////////////////////////////////////////////////////////////////////////


     /*
      import java.io.*;
import java.util.*;

class Solution{
    public long findLastTwoDigitNterm(long N){
       //Write code here
		long a=0,b=1,c=0;
		for (long i=2; i<=N; i++){
			c=(a+b)%100;
			a=b;
			b=c;
		}
		return c;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        long n = input.nextInt();
        Solution Obj = new Solution();
        long ans = Obj.findLastTwoDigitNterm(n);
        if(ans < 10)
            System.out.println("0" + ans);
        else
            System.out.println(ans);
    }
}
      */
}
