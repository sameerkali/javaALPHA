import java.util.*;
import java.lang.*;
import java.io.*;

public class test
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, temp, reminder, sum ;
        sum = 0 ; 
        num = sc.nextInt();
        temp = num;
        while (num > 0){
            reminder = num%10;
            sum = (sum*10) + reminder;
            num = num / 10;
        }
        if(sum == temp){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}