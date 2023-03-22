package stack;
import java.util.*;
  //sahi se samaj nhi aaya 17/02.2023 hope ki future me jb main ye code revisit krunga toh zaroor aata hoga (mehnat toh ki par aadha adhura sa samaj aaya ). :)

public class stockSpanProblem {
    public static void stocksSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        //loop lagaa ke roz ka span check kro
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
                if(s.isEmpty()) span[i] = i+1;
                else{
                    int prevHeight = s.peek();
                    span[i] = i-prevHeight;
                }
               s.push(i); 
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int[] span = new int [stocks.length];

        stocksSpan(stocks,span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }

    }
}
