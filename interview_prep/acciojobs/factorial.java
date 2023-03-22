package interview_prep.acciojobs;
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 2;
        int reminder=0;
    
        for (int i = 0; i < n; i++) {
            reminder = n%10;
            ans += ans * reminder;
            n /= 10;
        }

        
        System.out.println(reminder);
    }
    
}
