package interview_prep.Arrays;


public class findDuplicatesInArraysJSMUdemy {

  public static boolean isDuplicate(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6 };
    int[] b = { 7, 8, 9, 10, 11, 12 };
    if (isDuplicate(a, b)) System.out.println(
      "duplicate found"
    ); else System.out.println("duplicate not found");
  }
}
