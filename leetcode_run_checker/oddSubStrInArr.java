package leetcode_run_checker;

public class oddSubStrInArr {
    public static int numOfSubarrays(int[] arr) {
        int cnt = 0;
        int store = 0;
        for (int i=0; i<=arr.length; i++){
            for(int j=i+1; j<=arr.length; j++){
                store = arr[j];
                cnt++;
            }
            System.out.println(store);
        } 
        return cnt;  
       }
       public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(numOfSubarrays(arr));
       }
}
