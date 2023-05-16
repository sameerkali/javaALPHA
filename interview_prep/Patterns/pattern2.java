package interview_prep.Patterns;

import java.util.*;

public class pattern2 {

  public static void main(String[] args) {
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number Here");
    number = sc.nextInt();
    pattern9(number);
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

  //   public static void pattern5(int n) {
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= n - i + 1; j++) {
  //         System.out.print(j);
  //       }
  //       System.out.println();
  //     }
  //   }
  // 12345
  // 1234
  // 123
  // 12
  // 1
  //   public static void pattern6(int n) {
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j < i; j++) {
  //         if ((i+(j))% 2 == 0) System.out.print(1 + " "); else System.out.print(
  //           0 + " "
  //         );
  //       }
  //       System.out.println();
  //     }
  //   }
  // 0
  // 0 1
  // 0 1 0
  // 0 1 0 1
  // 0 1 0 1 0
  // 0 1 0 1 0 1
  // public static void pattern7(int n){
  //     for (int i = 1; i < n; i++) {
  //         for (int j = 1; j < n; j++) {
  //             if(i == n-1 || i == 1 || j == n-1 || j == 1){
  //                 System.out.print("*");
  //             }else{
  //                 System.out.print(" ");
  //             }
  //         }
  //         System.out.println();
  //     }
  // }
  // ****
  // *  *
  // *  *
  // ****
  //   public static void pattern8(int n) {
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= n - i; j++) {
  //         System.out.print(" ");
  //       }
  //       for (int j = 1; j <= (2 * i) - 1; j++) {
  //         System.out.print("*");
  //       }
  //       System.out.println();
  //     }
  //   }
  //     *
  //    ***
  //   *****
  //  *******
  // *********
  public static void pattern9(int n) {
    for (int i = 1; i <= n; i++) {
      
      for (int j = 1; j <= (n - i); j++) System.out.print(" ");

      for (int j = 1; j <= i; j++) System.out.print(j);

      for (int j = i - 1; j >= 1; j--) System.out.print(j);

      System.out.println();
    }
  }
//    1
//   121
//  12321
// 1234321
}
