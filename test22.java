public class test22 {
    // public static int[] runningSum(int[] nums) {
    //     int sum = 0;
    //     for(int i = 0; i<nums.length; i++){
    //         for(int j= i;j<nums.length; j++){
    //             sum += i+j;
    //             System.out.print(sum);
    //         }
            
    //     }
    //     return nums;
        
    //     }
    // public static void main(String args[]){
    //     int nums[] = {3,1,2,10,1};
    //     runningSum(nums);
    // }

    public static int[] runningSum(int nums[]) {
        int[] results  = new int[nums.length];
        results[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
          results[i] = nums[i] + nums[i-1];
        }
        return results;
        }
    public static void main(String args[]){
        int nums[] = {3,1,2,10,1};
        System.out.print(runningSum(nums));
    }   
}
