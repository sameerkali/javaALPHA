package stack;

import java.util.Stack;

public class reverseAStack {
    // we have to brake this problem into following parts -- 
    // 1- reverse the stack 2- push at bottom 3- print

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()) return;

        int add = s.pop();
        reverseStack(s);
        pushAtBottom(s, add);
    }

    //2-push at bttom
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()) {
        s.push(data);
        return;
    }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }


    //print 
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        printStack(s);

    }
}
