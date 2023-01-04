package Recursion;

public class print10_1 {
    public static void printDec (int num) {
        if(num == 1){
            System.out.print(num);
            return;
        }
        System.out.print(num + " ");
        printDec(num - 1);
    }
 
public static void main(String[] args) {
    int num = 10;
    printDec(num);
}    
}
