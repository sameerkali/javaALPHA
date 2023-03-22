package stack;
import java.util.*;


public class implimentStackWithLL {

    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        public static Node head = null;

        //isEmpty
        public static boolean isEmpty(){
            return head == null;
        }

        //push
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop
        public static int pop(){
            if(isEmpty()) return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()) return -1;
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
