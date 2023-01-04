import java.util.*;
import java.util.Scanner;

class a {
    public static void main(String[] args){
        int n;
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=(n-i)+1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     // System.out.print(" ");
        //     for(int j=2;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}