package interview_prep.acciojobs;

// public class duplicateInArray {
    
// }

import java.util.*;

// class Accio {
//     public void duplicates(int[] arr) {
//         // Write code and print output here
// 		for(int i = 0; i<arr.length; i++){
//                for(int j = 0; j<arr.length; j++){
//                    if(arr[i] == arr[j]){
// 					   System.out.println("true");
//                    }else{
// 					   System.out.println("false");
					   
// 				   }
//                }
//            }
//     }
// }

public class duplicateInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
            for(int i = 0; i<arr.length; i++){
                for(int j = 0; j<i; j++){
                    if(arr[i] == arr[j]){
                        System.out.println("true");
                        break;
                    } 
                    else{
                        System.out.println("false");
                    }
                }
            }
        
    }
}