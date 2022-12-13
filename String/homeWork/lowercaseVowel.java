package String.homeWork;
import java.util.Scanner;



public class lowercaseVowel {
    private static String a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type here to check vowels in this sentense");
        String st =  sc.nextLine();
        System.out.println(st);
        Integer count = 0;
        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);
            if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ){
                count++;
            }
        }
        System.out.println("The count of vowels in this sentese is = " + " " + count);





//         for(int i = st; i < st.length(); i++){
//             switch(i){
//                 case "a": 
//                     System.out.println("a");
//                     break;
//                     case "e": 
//                     System.out.println("e");
//                     break;
//                     case "i": 
//                     System.out.println("i");
//                     break;
//                     case "o": 
//                     System.out.println("o");
//                     break;case "u": 
//                     System.out.println("u");
//                     break;
//                     case "A": 
//                     System.out.println("A");
//                     break;
//                     case "E": 
//                     System.out.println("E");
//                     break;
//                     case "I": 
//                     System.out.println("I");
//                     break;
//                     case "O": 
//                     System.out.println("O");
//                     break;
//                     case "U": 
//                     System.out.println("U");
//                     break;
//                     default:
//                     System.out.println("bhai sahi se type krle");
//             }
//         }

        
    }
}
