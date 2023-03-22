package Linked_list;
import java.util.LinkedList;

public class lludemy {
    public static void main(String[] args) {
        LinkedList<String> dll = new LinkedList<>();
        dll.addFirst("sameer1");
        dll.add(1, "sameer2");
        dll.addLast("sameer3");
        for(String name : dll){
            System.out.print(name +"->");
        }
        System.out.print("null");
        System.out.println();

        LinkedList<Integer> dlli = new LinkedList<>();
        dlli.addFirst(22);
        dlli.add(1, 221);
        dlli.addLast(28);
        for(Integer name : dlli){
            System.out.println(name);
        }
    }
}
