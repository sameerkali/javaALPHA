package interview_prep.acciojobs;
import java.util.*;

public class seriesQuestionIDK {

    // Driver Code
    public static void main(String args[])
    {
        // number of terms to be
        // included in the sum
        Scanner ob= new Scanner(System.in);
        int n= ob.nextInt();
        // Your code here
		int sum = 0;

		System.out.print(n*(4*n*n+6*n-1)/3);
    }
}
//   (question Write a program to calculate the sum of following
//   series where n is input by user. Sn = 1*3 + 3*5 + 5*7 + …)
//input 10
//outpoot 1530
