package Greedy;

import java.util.*;

public class minAbsoulteDiffBetweenTwoPairs {

  public static int minAbsDiff(int[] a, int[] b) {
    Arrays.sort(a);
    Arrays.sort(b);

    int minDiff = 0;

    for (int i = 0; i < b.length; i++) {
      minDiff += Math.abs(a[i] - b[i]);
    }
    return minDiff;
  }

  public static void main(String[] args) {
    int[] a = { 3, 4, 5, 7, 8, 9 };
    int[] b = { 1, 2, 4, 5, 6, 9 };

    System.out.println(minAbsDiff(a, b));
  }
}
