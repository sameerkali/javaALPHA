package interview_prep.Strings;


public class addA_stringng_number {
//     public static void add(String s){
//         String numStr = "";
//         for (int i = 0; i < s.length(); i++) {
//             if(Character.isDigit(s.charAt(i))){
//                 numStr = numStr + s.charAt(i);
//             }
//         }
//         Integer.parseInt(numStr);

//         int add = 0;
//         for (int j = 0; j < numStr.length(); j++) {
//             add = add + numStr.charAt(j);
//         }
//         System.out.println(add);

//     }


//     public static void rotate(String s, int rotetion){
        
//         // char[] sa = s.toCharArray();
//         String oldd = "";
//         // String neww = "";

//         int sum = 0;
//         for (int i = 0; i < s.length()-rotetion; i++) {
//         //    oldd =oldd + s.charAt(i);
//         int value = Character.getNumericValue(s.charAt(i))
//         }
//         if(value)
//         // for (int i = 0; i < s.length()-rotetion; i++) {
//         //     neww = neww + s.charAt(i);
//         // }

// //         System.out.println(s+neww);
// System.out.println(oldd);
//     }






    public String addStrings(String num1, String num2) {
        int sum = 0;
        int value1=0,value2=0;
        for(int i=0 ; i<num1.length() ; i++){
            value1 = Character.getNumericValue(num1.charAt(i));
        }
        for(int j=0 ; j<num2.length() ; j++){
            value2 = Character.getNumericValue(num1.charAt(j));
        }
        System.out.println(value1 + value2);
        // system.out.print(value2);
    }






    public static void main(String[] args) {
        String str = "sameer123";
        int rotation = 2;
        // add(str);
        // rotate(str, rotation);
    }
}
