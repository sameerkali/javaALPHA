package String;

import java.util.Arrays;

public class anagram {

  public static void main(String[] args) {
    String a = "sameer", b = "reemaks";
    char[] A = a.toCharArray();
    char[] B = b.toCharArray();
    Arrays.sort(A);
    Arrays.sort(B);
    boolean result = Arrays.equals(A, B);
    if (result) {
      System.out.println("Anagram");
    } else {
      System.out.println("Not Anagram");
    }
  }
}
