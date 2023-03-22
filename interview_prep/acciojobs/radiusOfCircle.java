package interview_prep.acciojobs;
import java.util.*;


public class radiusOfCircle {

public static void main(String[] args) {
    // double pie =3.14159265358979323846;               ////the real value of pie 🥲
	// 	Scanner s = new Scanner(System.in);
	// 	int n = s.nextInt();
	// 	double radius = n/(2*pie);
	// 	double parimiter = (2*pie*radius)/(2*pie);
    //     System.out.println(radius+" "+ parimiter);
	Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double pie =Math.PI; 
		double r = n/(2*pie);
		double parimeter = 2*(pie*r); 
		    System.out.println(parimeter);
		
}
}

    
