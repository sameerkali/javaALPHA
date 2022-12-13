// import java.*;
// public class pattern1{
//     public static boolean isPrime (int n){
//         if(n == 2){
//             return true;
//         }
//         for(int i = 2 ; i <= Math.sqrt(n) ;){
//             if(n % i == 0){
//                 return false;
//             }
//             return true;
//         }
//         return false;
//     }
// public static void main(String[] args) {
//     System.out.print(isPrime(5));
//     for (int line1=1;line1<=4;line1++){
//         for(int line2=1;line2 <= line1; line2++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// }   




//Question 5
// class arrayRepeatChecker {
//     public static void main(int[] arrA, int[] arrB){
//         int[] arr1 = arrA;
//         int[] arr2 = arrB;
//         for(int i = 0; i<=arr1.length; i++){
//             for(int j = 0; j <= i; j++){
//                 if(arr1[i] == arr2[j]){
//                     System.out.println(i);
//                 }
//             }
//         }
//     }
    
//     public static void main(String[] args) {
//         int[] numA = {1,2,3,4,5,6,7,8,9};
//         int[] numB = {1,2,3,4,15,6,7,12,9};
//         arrayRepeatChecker(numA, numB);
//     }

//     }


//Question 1

// class isPrime {
//     static boolean isPrime(int n)
//     {
//         if (n <= 1)
//             return false;
//         for (int i = 2; i < n; i++)
//             if (n % i == 0)
//                 return false;
//         return true;
//     }
//     static void printPrime(int n)
//     {
//         for (int i = 2; i <= n; i++) {
//             if (isPrime(i))
//                 System.out.print(i);
//         }
//     }
//     public static void main(String[] args)
//     {
//         scanner = sc new Scanner(System.in);
//         System.out.print("Enter a number");
//         int a = sc.nextint();
//         printPrime(a);
// }
// }