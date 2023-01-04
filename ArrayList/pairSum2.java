import java.util.*;

public class pairSum2{
    public static boolean pairSumTwo(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        for(int i=0; i < list.size(); i++){     //break point
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;

        while(lp != rp){
            //case1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % n;
            }else{   //case3
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int target = 21;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(6);

        System.out.println(pairSumTwo(list, target));
    }
}