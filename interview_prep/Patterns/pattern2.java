package interview_prep.Patterns;

import java.util.*;

public class pattern2 {

  public static void main(String[] args) {
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number Here");
    number = sc.nextInt();
    pattern5(number);
  }

  //   public static void pattern1(int n) {
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print(j);
  //       }
  //       System.out.println();
  //     }
  //   }

  // public static void pattern02(int n){
  //     for (int i = 1; i <= n; i++) {
  //         for (int j = 1; j <= n-1; j++) {
  //             System.out.println(" ");
  //         }
  //         for (int j = 1; j <= i; j++) {
  //             System.out.println("*");
  //         }
  //     }
  // }

  // *
  // **
  // ***
  // ****
  // *****

//   public static void pattern3(int n) {
//     for (int i = 1; i <= n; i++) {
//       for (int j = n; j >= i; j--) {
//         System.out.print(j + " ");
//       }
//       System.out.println();
//     }
//   }
// 5 4 3 2 1
// 5 4 3 2
// 5 4 3
// 5 4
// 5

// public static void pattern4(int n){
//     for (int i = 1; i <= n; i++) {
//         for (int j = 1; j <= i; j++) {
//             System.out.print(" ");
//         }
//         for (int j = n; j >= i; j--) {
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }

// 54321
//  5432
//   543
//    54
//     5

public static void pattern5(int n){ 
    for (int i = 0; i < n; i++) {
        
    }
}
}
