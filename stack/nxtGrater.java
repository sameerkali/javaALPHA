package stack;
import java.util.*;

public class nxtGrater {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int[] nxtGrater = new int[arr.length];

        for (int i = arr.length-1; i>=0; i--) {
            //1-while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //if else
            if(s.isEmpty()){
                nxtGrater[i] = -1;
            }else{
                nxtGrater[i] = arr[s.peek()];
            } 
            //push
            s.push(i);
        }

        for (int i = 0; i < nxtGrater.length; i++) {
            System.out.print(nxtGrater[i] +  " ");
        }
        System.out.println();
    }
}
