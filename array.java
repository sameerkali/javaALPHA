//question 4 remove same numbers 
public class array{
    public static int[] arrayElementsChecker(int[] numA, int[] numB) {
        int[] num1 = numA;
        int[] num2 = numB;
           for(int i = 0; i<num1.length; i++){
               for(int j = 0; j<i; j++){
                   if(num1[i] == num2[j]){
                       System.out.print(i);
                   }
               }
           }
        return num2;
   
        }
   
   
       public static void main(String[] args){
           // int num[] = {2,4,5,6,7,8,9,23,45,56};
           
           // if(index == -1){
           //     System.out.print("Not Avalable");
           // }else{
           //     System.out.print("Avalable at index:"+ index);
           // }
   
           int numA[] = {3,1,2,10,1};
           int numB[] = {3,1,2,10,1};
           arrayElementsChecker(numA,numB);
       }
   }