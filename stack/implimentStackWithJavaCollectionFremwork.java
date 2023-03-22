package stack;
import java.util.*;

public class implimentStackWithJavaCollectionFremwork {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);
        s.push(16);
        s.push(17);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
    
}
