package interview_prep.Arrays;

public class sumInPairs {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,78};
        int number = 81;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == number) System.out.println(arr[i]+ " + " +arr[j] + " = "+ number);
            }
        }
    }
}


//...............................................................................................

//question -- find continuous sub array who is equal to given number   ( galat hai answer)



// package interview_prep.Arrays;

// public class sumInPairs {
//     public static boolean pair(int[] arr, int num){

//         int store = 0;
//         int i;
//         for (i = 0; i < arr.length; i++) {
//             int j;
//             for ( j = i; j < arr.length; j++) {
//                 store += arr[j];  //  x=x+i     ==     x+=i
//             }
//             // System.out.println(store +" for "+i+" , "+ j);
//             if(store == num) return true;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int[] arr = {2,3,4,5,6,7,78};
//         int num = 11;
//         System.out.println(pair(arr,num));


        
//     }}

