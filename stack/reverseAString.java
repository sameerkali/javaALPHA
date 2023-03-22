package stack;

import java.util.Stack;

public class reverseAString {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("s");
        s.push("a");
        s.push("m");
        s.push("e");
        s.push("e");
        s.push("r");
        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }

    }
}
