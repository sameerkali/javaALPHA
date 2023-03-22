package interview_prep.acciojobs;
import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class secoundLargest {
    public static void main(String args[]) {
        // your code here
		int[] arr = new int[5];
		Scanner sc=new Scanner(System.in); 
		for(int i=0; i<5; ++i){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[3]);

    }
}
