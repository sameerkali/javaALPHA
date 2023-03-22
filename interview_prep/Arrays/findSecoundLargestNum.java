package interview_prep.Arrays;

public class findSecoundLargestNum {
   
    public static void main(String[] args) {

        int[] a = { 34, 43, 1, 2, 112, 100, 54, 6969, 969 };
        
        int max1 = 0, max2 = 0;

        if (a[0] > a[1]) {
            max1 = a[0];
            max2 = a[1];
        }else{
            max1 = a[1];
            max2 = a[0];
        }

        for (int i = 2; i < a.length; i++) {
            if(a[i] > max1){
                max2 = max1;
                max1 = a[i];
            }else if(a[i] < max1){
                max2 = a[i];
            }
    }
    System.out.println("largest : "+max1);
    System.out.println("secound largest : "+max2);
}
}
