package interview_prep.Arrays;

import javax.swing.CellEditor;

public class maximumConsucutiveInBinaryArray {
    

    /////////////////////////////////////////////////////////////////////////////

    public static int zero(int[] check_me){
        int zero_count = 0;
        int zero_maxi = 0;

        for (int i = 0; i < check_me.length; i++) {
            if(check_me[i] == 0){
                zero_count++;
            }else{
                zero_count = 0;
            }
            zero_maxi = Math.max(zero_maxi,zero_count);

        }
        return zero_maxi;
    }
    /////////////////////////////////////////////////////////////////////////////


    public static int one(int[] check_me){
        int one_count = 0;
        int one_maxi = 0;

        for (int i = 0; i < check_me.length; i++) {
            if(check_me[i] == 1){
                one_count++;
            }else{
                one_count = 0;
            }
            one_maxi = Math.max(one_maxi,one_count);

        }
        return one_maxi;
    }



    /////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        int[] check_me = { 1,0,0,1,0,0,0,0,1,0,0,1,1,1,1,1,0};        //count aakhir me 4 toh ho jaiga par uske baad ek 0 bhe hai iss lea count = 0 ho jaiga iss case ke lea hi hamne maxi banaya hai (all thanks to striver waise maine 90% khud kia hai bas maxi wala idea dekha hai)
        
         

        if (one(check_me) > zero(check_me)){
        System.out.println("number of maximum subcount of 1 : "+one(check_me));
        }else{
        System.out.println("number of maximum subcount of 0 : "+zero(check_me));
        }

        // return Math.max(one(check_me) , zero(check_me));   // not working
    }
}





//.................................//optimized code by saransh ........................................


        
        
/*  public class Main{

	public static void main(String[] args) {
		int[] arr = {0,0,0,0,0,1,1,1,1};
		// 0 -> 5 and 1 -> 4
		
		findGreaterBinaryInArray(arr);
		
	}
	
	public static void findGreaterBinaryInArray(int[] arr) {
	    int countZero = 0;
	    int i = 0;
	    while(arr[i++]!=1) {
	        countZero++;
	    }
	    i = 0;
	    int countOne = 0;
	    while(arr[i++]!=0) {
	        countOne++;
	    }
	    
	    if(countZero>countOne) {
	        i=0;
	        while(i++<countZero) {
	            System.out.print(0+" ");
	        }
	    } else if(countZero<countOne) {
	        i=0;
	        while(i++<countOne) {
	            System.out.print(1+" ");
	        }
	    } else {
	        System.out.printf("Array contains equal number of zero and one.!");
	    }
	    
	}
	
} */