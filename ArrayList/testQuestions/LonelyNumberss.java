package testQuestions;
import java.util.*;


public class LonelyNumberss {
    public static boolean LonelyNumbers(ArrayList<Integer> list) {
        boolean inc;
        boolean dec;

        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i) <= list.get(i+1)) return true;
            if(list.get(i) >= list.get(i+1)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(10);
        list.add(11);

        System.out.println(LonelyNumbers(list));


    }
}
