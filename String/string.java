package String;

import java.util.Scanner;

public class string {
    // public static void printletters (String str){
    //     for (int i = 0; i < str.length(); i++){
    //         System.out.print(str.charAt(i) + " ");
    //     }
    //     System.out.println();
    // }/

    public static boolean Palindrome (String str){
        for (int i = 0; i < str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
        }
    public static void main(String[] args) {
        System.out.println("Enter to check is palindrome or not");
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();
        // System.out.println( "hii" + " " + name);
        // System.out.println( name.charAt(3));
        // String str = "samasw";
        System.out.println( Palindrome(name));

    }
    public string next;
    public string next() {
        return null;
    }
    public static int length() {
        return 0;
    }
    public Object charAt(int i) {
        return null;
    }
}
