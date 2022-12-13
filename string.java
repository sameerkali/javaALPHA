// import java.util.Arrays;

// import java.util.*;
// public class string {
//     public static String toUppercase(String str){
//         StringBuilder sb = new StringBuilder("");
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for( int i=1; i<str.length(); i++){
//             if(str.charAt(i) == ' ' && i<str.length()-1){
//             sb.append(str.charAt(i));
//             i++;
//             sb.append(Character.toUpperCase(str.charAt(i)));
//         }
//         else{
//             sb.append(str.charAt(i));
//         }
//     }
//     return sb.toString();
// }
// private int length() {
//         return 0;
//     }
// private char charAt(int i) {
//         return 0;
//     }
// public static void main(String[] args){
//     String str = "hi i am sameer";
//     System.out.print(toUppercase(str));
// }






// public static void detect(String str){

    
// }
// public class string {
// public static void main(String[] args){
//         String str = "sameer faridi AEIOU aeiou";
//         StringBuilder sb = new StringBuilder();

//    for(int i=0; i<str.length(); i++){
//     char ch = str.charAt(i);
//     switch (ch){
//         case 'a':
//         sb.append(ch);
//         break;
//         case 'e':
//         sb.append(ch);
//         break;
//         case 'i':
//         sb.append(ch);
//         break;
//         case 'o':
//         sb.append(ch);
//         break;
//         case 'u':
//         sb.append(ch);
//         break;
//         default:
//     }
//    }
// System.out.println(sb);     
// }
// }


















// public class string {
//     public static void main(String[] args){
//         String str="ShradhaDidi";
//         String str1="ApnaCollege";
//         String str2="ShradhaDidi";
//         System.out.println(str.equals(str1) +" "+str.equals(str2));
//     }
// }








// public class string {
//     public static void main(String[] args){
//         String str="Apna College".replace(" ","");
//         System.out.println(str);
//     }


// public static boolean isAnagram(String str1, String str2){
//     if(str1.length()!=str2.length())
//         return false;
//     char ch1[] = str1.toCharArray();
//     char ch2[] = str2.toCharArray();
//     Arrays.sort(ch1);
//     Arrays.sort(ch2);
//     boolean isEqual = true;
//     for(int i=0;i<ch1.length;i++) {
//         if(ch1[i]!=ch2[i]) isEqual = false;
//     }
//     if(isEqual) return true;
//     else return false;
// }
// }/
