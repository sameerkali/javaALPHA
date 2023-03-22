package interview_prep.acciojobs;
import java.util.*;

public class test {
    

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max)
                max = arr[j];
        }
        return max;
    }

    public static void larget(int[] arr, int n) {
        int max = findMax(arr);
        System.out.println(max);

        Arrays.sort(arr);
        // 0 1 2 3 6
        // boolean isLarget = true;
        for (int i = 0; i < n - 1; i++) {
            int sum = 2 * arr[i];
            if (!(max >= sum)) System.out.println("0"); 
            else System.out.println("1");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        larget(nums, n);

    }
}
