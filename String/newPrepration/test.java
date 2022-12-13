package String.newPrepration;
import java.util.*;

import String.string;

public class test{
    public static void main(String[] args) {
        String sb = new String("sameer");
        Scanner sc = new Scanner(System.in);
        String sameer = sc.nextLine();
        System.out.println(sameer);

    }
    public static boolean ans(string str){

        for(int i=0;i<=str.length()/2;i++){
            int n = str.length();
            if(charAt(i) != str.charAt(n-1-i)) return false;
        }
    }
    private static Object charAt(int i) {
        return null;
    }
}
