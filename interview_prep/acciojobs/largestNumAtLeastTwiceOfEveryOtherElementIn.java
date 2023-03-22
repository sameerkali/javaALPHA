package interview_prep.acciojobs;

import java.util.*;

public class largestNumAtLeastTwiceOfEveryOtherElementIn {



    public static int LargestElement(int[] arr, int n) {
		
		//find max
		int max = arr[0], maxI = 0;
		for(int i=0; i<n; i++){
			if(arr[i] > max){
				max = arr[i];
				maxI = i;
			}
		}

		// compare

		for(int i=0; i<n; i++){

			if(i != maxI && (2*arr[i]) > max){
				return -1;
			}

		}
		return maxI;
	
    }







    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;
            n = sc.nextInt();
            int[] nums = new int[n];
    
            for(int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.println(LargestElement(nums,n));
 
    }

}






















//     package interview_prep.acciojobs;

// import java.util.*;

// public class largestNumAtLeastTwiceOfEveryOtherElementIn {

//     public static int findMax(int[] arr) {
//         int max = arr[0];
//         for (int j = 1; j < arr.length; j++) {
//             if (arr[j] > max)
//                 max = arr[j];
//         }
//         return max;
//     }

//     public static void larget(int[] arr, int n) {
//         int max = findMax(arr);
//         System.out.println(max);

//         Arrays.sort(arr);
//         // 0 1 2 3 6
//         // boolean isLarget = true;
//         for (int i = 0; i < n - 1; i++) {
//             int sum = 2 * arr[i];
//             if (!(max >= sum)) System.out.println("0"); 
//             else System.out.println("1");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n;
//         n = sc.nextInt();
//         int[] nums = new int[n];

//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }
//         larget(nums, n);

//         ////////////////////////////////////////////////////////
//         // find max
//         // int max = Integer.MIN_VALUE;
//         // for( int j=1 ; j<n ; j++){
//         // if(nums[j] > max) max = nums[j];
//         // }
//         // System.out.println(max);

//         // int cnt1=0,cnt2=0;

//         // for (int k = 0; k < n; k++) {
//         // if (max == nums[k]) break;
//         // if (max >= 2*nums[k]) System.out.println("2x bada hai iska");
//         // else System.out.println("2x bada nhi hai iska");

//         // }
//         // System.out.println(cnt1+" "+cnt2);
//     }
// }
// // if (max >= 2*nums[k]) System.out.println("2x bada hai iska");
// // else System.out.println("2x bada nhi hai iska");

// // if (max >= 2*nums[k]) cnt1++;
// // else cnt2++;

// ////////////////////////////////////////////// find largest in
// ////////////////////////////////////////////// array/////////////////////////////////
// // int max = nums[0];
// // for( int j=1 ; j<n ; j++){
// // if(nums[j] > max) max = nums[j];
// // }
// ///////////////////////////////////////////////////////////////////////////////////////////////////
