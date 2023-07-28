package Linked_list;

import Linked_list.linkedlist.Node;

public class linkedlist {
    public static Node head;
    public static Node tail;
    public static int size=0;

    public static class Node {
        public int data;
        Node next;
        public Object left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = tail = newnode;
        } else {
            size++;
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addLast(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = tail = newnode;
        } else {
            size++;
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void add(int index, int data){
        if(index == 0){
            addFirst(data);
            size++;
            return;
        }
        int i=0;
        Node temp = head;

        while(temp != null){
            if(i == index-1){
                size++;
                Node newnode = new Node(data);
                newnode.next = temp.next;
                temp.next = newnode;
                return;
            }
        temp = temp.next;
        i++;    
        }
    }

    public int removeFirst(){
        //if ll is empty
        if(size == 0){
            System.out.println("the linkedList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addFirst(8);
        ll.addFirst(81);
        ll.addFirst(18);
        ll.addLast(821);
        ll.add(3,69);
        ll.removeFirst();
        ll.print();
    }
}
