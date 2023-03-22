package homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String first = sc.nextLine();
        System.out.println("Enter Secound String");
        String second = sc.nextLine();

        // String first = "racecar";
        // String second = "carrace";

        first = first.replace(" ", "");
        second = second.replace(" ", "");
        
        first = first.toLowerCase();
        second = second.toLowerCase();

        char a[] = first.toCharArray();
        char b[] = second.toCharArray();

        
        Arrays.sort(a);
        Arrays.sort(b);
        
        

        boolean answer = Arrays.equals(a, b);

        if (answer) System.out.println(first +" "+" or " +" "+second+ " "  + "are "+" " + "Anagram");
        else System.out.println(first +" "+" or " +" "+second + " " + "are "+" " +"Not Anagram");

        
    }
}
