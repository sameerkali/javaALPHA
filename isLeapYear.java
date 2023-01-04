import java.util.*;
import java.lang.*;
import java.io.*;

public class isLeapYear
{
  
public static int LeapYear(int year){
  if(year % 4 == 0){
    
    if (year % 100 == 0)
                                  {
       if(year % 400 == 0){
           return 1; }
      
       else{
           return 0; }
                                  }
    else{
      return 1;
    }
  
}
  else {
    return 0;
  }
}
  
  
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
   System.out.print( LeapYear(year));
	}
}

//is not leap year == 0 || leap year == 1