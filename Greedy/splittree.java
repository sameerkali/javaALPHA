package Greedy;

public class splittree {

  public static void main(String[] args) {
    String str = "LRRRRLLRLLRL";
    int count = 0;
    int total = 0;

    for (char ch : str.toCharArray()) {
      if (ch == 'R') ++count;
      if (ch == 'L') --count;
      if(count == 0) ++total;
    }
    System.out.println(total);
  }
}
