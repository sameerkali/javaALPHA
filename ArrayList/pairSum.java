import java.util.*;

public class pairSum {

    //unoptimized  O(n^2)
    public static boolean pairSum1(ArrayList<Integer> list , int target){

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }

        return false;
    }




    //optimized O(n)
    public static boolean pairSum2(ArrayList<Integer> list , int target){

       int lp = 0, rp = list.size()-1;

       while(lp != rp){
        //first condition
        if(list.get(lp) + list.get(rp) == target) return true;
        // secound condition
        if(list.get(lp) + list.get(rp) < target) lp++;
        //third condition
        else rp--;
       }

        return false;
    }


    
    public static void main(String[] args) {
        int target = 53;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(pairSum2(list, target));
    }
}
