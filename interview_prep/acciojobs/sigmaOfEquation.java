package interview_prep.acciojobs;

import java.util.*;

public class sigmaOfEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

		long ans = 0L;

		for(long i =1 ; i<=n ; i++){
		 ans += ((i+1)*(i+1) - ((3 * i) + 1)+i);
		}

        System.out.println(ans);
    }
}
