package interview_prep.acciojobs;
import java.lang.reflect.Array;
import java.util.*;



public class findSmalestArrayDevisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int chk = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i] % 5 == 0) {
                chk = arr[i];
            }

            
        }
    }
    
        
}
