package interview_prep.acciojobs;


public class alternativeNumberSumIsSame {
    
    public static void main(String[] args) {
        int a=0,b=0;
        int[] arr = {1,2,4,3,0};                     /// in this eg 1,4,0 == 2,3 
        for (int i = 0; i < arr.length; i+=2) {
            a+=arr[i];
        }
        for (int j = 1; j < arr.length; j+=2) {
            b+=arr[j];
        }
        if(a==b)  System.out.println("1");
        else  System.out.println("0");
    }
}
