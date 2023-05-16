package interview_prep.Patterns;

import java.util.Scanner;

public class allPattern {

  public static void main(String args[]) {
    int n;
    System.out.print("Number:");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    pattern16(n);
  }

  // ----------------------------------------------------------------------------//
  public static void pattern16(int n) {
    for (int i = 1; i <= n; i++) {
      //spaces
      for (int j = 1; j <= (n - i) + 1; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // ----------------------------------------------------------------------------//

  //   public static void pattern15(int n) {
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= (n - i); j++) System.out.print(" ");

  //       for (int k = i; k >= 1; k--) System.out.print(k);

  //       for (int l = 2; l <= i; l++) System.out.print(l);

  //       System.out.println();
  //     }
  //   }

  // ---------------------------------OR-------------------------------------------//

  //   public static void pattern15(int n) {
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= (n - i) + 1; j++) System.out.print(" ");

  //       for (int j = 1; j <= i; j++) System.out.print(j);

  //       for (int j = i - 1; j >= 1; j--) System.out.print(j);

  //       System.out.println();
  //     }
  //   }

  //      1
  //     121
  //    12321
  //   1234321
  //  123454321
  // ----------------------------------------------------------------------------//

  // public static void pattern15(int n) {
  //     for (int i = 1; i <= n; i++) {
  //         for (int j = 1; j <=(n-i)+1; j++){
  //             System.out.print(" ");
  //         }
  //         for (int j = 1; j <=i; j++){
  //             System.out.print(i + " ");
  //         }
  //         System.out.println();
  //     }
  // }
  //      1
  //     2 2
  //    3 3 3
  //   4 4 4 4
  //  5 5 5 5 5
  // ----------------------------------------------------------------------------//

  // public static void pattern15(int n, int m) {
  //     for (int i = 1; i <= n; i++) {
  //         for (int j = 1; j <=i; j++) {
  //             if((i+j)%2==0){
  //                 System.out.print("1" + " ");
  //             }else{
  //                 System.out.print("0"+' ');
  //             }
  //         }
  //         System.out.println();
  //     }
  // }
  // 1
  // 0 1
  // 1 0 1
  // 0 1 0 1
  // 1 0 1 0 1
  // ----------------------------------------------------------------------------//

  // public static void pattern15(int n, int m) {
  //     int count = 1;
  //     for (int i = 1; i <= n; i++) {
  //         for (int j = 1; j <=i; j++) {
  //             System.out.print(count + " ");
  //             count++;
  //         }
  //         System.out.println();
  //     }
  // }
  // 1
  // 2 3
  // 4 5 6
  // 7 8 9 10
  // 11 12 13 14 15
  // ----------------------------------------------------------------------------//

  // public static void pattern15(int n, int m) {
  //     for (int i = 1; i <= n; i++) {
  //         for (int j = 1; j <=n-i+1; j++) {
  //             System.out.print(j + " ");
  //         }
  //         System.out.println();
  //     }
  // }

  // 1 2 3 4 5
  // 1 2 3 4
  // 1 2 3
  // 1 2
  // 1
  // ----------------------------------------------------------------------------//

  // public static void pattern14(int n, int m) {
  //         for (int i = 1; i <= n; i++) {

  //             for (int j = 1; j <= m; j++) {
  //                 if(i==1||i==n||j==1||j==m){
  //                     System.out.print("*");
  //                 }else{
  //                     System.out.print(' ');
  //                 }
  //             }
  //             System.out.println();
  //         }
  //     }
  // *****
  // *   *
  // *   *
  // *****
  // ----------------------------------------------------------------------------//

  //   public static void pattern13(int n) {
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= n - i; j++) {
  //         System.out.print(" ");
  //       }

  //       for (int j = 1; j <= (2 * i) - 1; j++) {
  //         System.out.print("*");
  //       }
  //       System.out.println();
  //     }

  //     for (int i = n - 1; i >= 1; i--) {
  //       for (int j = 1; j <= n - i; j++) {
  //         System.out.print(" ");
  //       }

  //       for (int j = 1; j <= (2 * i) - 1; j++) {
  //         System.out.print("*");
  //       }
  //       System.out.println();
  //     }
  //   }

  //for print odd number's -- (2*i)-1

  //      *
  //     ***
  //    *****
  //   *******
  //   *******
  //  *********
  //   *******
  //    *****
  //     ***
  //      *
  // ----------------------------------------------------------------------------//

  //   public static void pattern12(int n) {
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= n - i; j++) {
  //         System.out.print(" ");
  //       }

  //       for (int j = 1; j <= n; j++) {
  //         if (i == 1 || j == 1 || i == n || j == n) {
  //           System.out.print("*");
  //         } else {
  //           System.out.print(" ");
  //         }
  //       }

  //       System.out.println();
  //     }
  //   }

  //          *****
  //         *   *
  //        *   *
  //       *   *
  //      *****
  // ----------------------------------------------------------------------------//

  // public static void pattern12(int n) {
  //         for (int i = 1; i <= n; i++) {

  //             for (int j = 1; j <= n-i; j++) {
  //             System.out.print(" ");
  //             }
  //             for (int j = 1; j <= n; j++) {
  //                 System.out.print("*");
  //                 }
  //             System.out.println();
  //         }
  //     }
  //      *****
  //     *****
  //    *****
  //   *****
  //  *****
  // ----------------------------------------------------------------------------//

  //   public static void pattern11(int n) {
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print("*");
  //       }
  //       for (int j = 1; j <= 2 * (n - i); j++) {
  //         System.out.print(" ");
  //       }
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print("*");
  //       }
  //       System.out.println();
  //     }

  //     for (int i = n; i >= 1; i--) {
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print("*");
  //       }
  //       for (int j = 1; j <= 2 * (n - i); j++) {
  //         System.out.print(" ");
  //       }
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print("*");
  //       }
  //       System.out.println();
  //     }
  //   }

  // *    *
  // **  **
  // ******
  // ******
  // **  **
  // *    *
  // ----------------------------------------------------------------------------//

  public static void pattern10(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        // if (i ==j || i - j == 2 ) {
        if ((i + j) % 2 == 0) {
          System.out.print("1" + " ");
        } else {
          System.out.print("0" + " ");
        }
      }
      System.out.println();
    }
  }
  // 1
  // 0 1
  // 1 0 1
  // 0 1 0 1
  // 1 0 1 0 1
  // ----------------------------------------------------------------------------//

  //   public static void pattern9(int n) {
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= i; j++) {
  //         if (j % 2 == 0) {
  //           System.out.print("1");
  //         } else {
  //           System.out.print("0");
  //         }
  //       }
  //       System.out.println();
  //     }
  //   }
  // 0
  // 01
  // 010
  // 0101
  // 01010
  // ----------------------------------------------------------------------------//

  // public static void pattern8(int n) {
  // int count= 1;
  // for (int i = 1; i <= n; i++) {
  // for (int j = 1; j <= i; j++) {
  // System.out.print(count + " ");
  // count++;
  // }
  // System.out.println();
  // }
  // }
  // 1
  // 2 3
  // 4 5 6
  // 7 8 9 10
  // 11 12 13 14 15
  // ----------------------------------------------------------------------------//

  // public static void pattern7(int n) {
  // for (int i = 1; i <= n; i++) {
  // for (int j = 1; j <= n-i+1; j++) {
  // System.out.print(j);
  // }
  // System.out.println();
  // }
  // }
  // 1234
  // 123
  // 12
  // 1
  // ----------------------------------------------------------------------------//

  //   public static void pattern6(int n) {
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = n; j >= i; j--) {
  //         System.out.print(j);
  //       }
  //       System.out.println();
  //     }
  //   }
  //   4321
  //   432
  //   43
  //   4
  // ----------------------------------------------------------------------------//

  //   public static void pattern5(int row) {
  //     for (int i = 1; i <= row; i++) {
  //       for (int j = 1; j <= row - i; j++) {
  //         System.out.print(' ');
  //       }
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print('*');
  //       }
  //       System.out.println();
  //     }
  //   }

  //     *
  //    **
  //   ***
  //  ****
  // *****
  // ----------------------------------------------------------------------------//

  //   public static void pattern4(int row, int col) {
  //     for (int i = 1; i <= row; i++) {
  //       for (int j = 1; j <= col; j++) {
  //         if (i == 1 || i == row || j == 1 || j == col) {
  //           System.out.print('+');
  //         } else {
  //           System.out.print(' ');
  //         }
  //       }
  //       System.out.println();
  //     }
  //   }
  // +++++
  // + +
  // + +
  // +++++
  // ----------------------------------------------------------------------------//

  //   public static void pattern3(int n) {
  //     char ch = 'a';
  //     for (int i = 1; i <= n; i++) {
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print(ch);
  //         ch++;
  //       }
  //       System.out.println();
  //     }
  //   }
  //   A
  //   BC
  //   DEF
  //   GHIJ
  //   KLMNO
  // ----------------------------------------------------------------------------//
  // public static void pattern2(int n) {
  // for (int i = 1; i <= n; i++) {
  // for (int j = 1; j <= i; j++) {
  // System.out.print(i);
  // }
  // System.out.println();
  // }
  // }
  // ----------------------------------------------------------------------------//
  //   public static void pattern1(int n, int count) {
  //     for (int i = 1; i <= n; i++) {
  //       count++;
  //       for (int j = 1; j <= i; j++) {
  //         System.out.print(count);
  //       }
  //       System.out.println();
  //     }
  //   }
  // 1
  // 22
  // 333
  // 4444
  // 55555
}
