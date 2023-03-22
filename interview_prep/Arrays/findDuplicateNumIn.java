package interview_prep.Arrays;
// import java.util.*;
 
public class findDuplicateNumIn {


    public static void main(String[] args) {
    //  Scanner sc = new Scanner(System.in);
    //  System.out.println("enter the number ");
    //  int a = sc.nextInt(); 
    int count = 0;

     String[] duplicate = {"sameer","faridi","raheem","golu","sameer", "golu"};
        for (int i = 0; i < duplicate.length; i++) {
            for (int j = i+1; j < duplicate.length; j++) {
                if(duplicate[i] == duplicate[j]){
                    System.out.println("Duplicate caught" + " : " + duplicate[i]);
                    count++;
                }
            }
        }
        System.out.println("Number of duplicates : "+count); 


    }
}