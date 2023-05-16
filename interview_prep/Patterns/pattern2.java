package interview_prep.Patterns;

import java.util.*;

public class pattern2 {
  public static void main(String[] args) {
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number Here");
    number = sc.nextInt();
    pattern1(number);
  }

  public static void pattern1(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
