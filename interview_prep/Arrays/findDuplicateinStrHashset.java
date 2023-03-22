package interview_prep.Arrays;

import java.util.HashSet;

public class findDuplicateinStrHashset {
    public static void main(String[] args) {
        HashSet <String> me = new HashSet<>();
        String[] arr = {"sameer","faridi","raheem","golu","sameer", "golu"};
        // System.out.println( me.add("sameer") );
        
        for(String l : arr){
            if(me.add(l) == false){
                System.out.println("Duplicate found : " + l);
            }
        }


    }
}
