package interview_prep.acciojobs;
import java.util.*;

public class findMajorityElementInArr {
    public static void majorityElement(int[] arr,int n) {
        //Write code here and print output
		int cnt= Integer.MIN_VALUE;
		for(int i=0; i<n; i++){
			if(arr[i]==arr[i]+1){
				cnt++;
			}
		}
		System.out.print(cnt);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

                majorityElement(arr,n);

    }
}
