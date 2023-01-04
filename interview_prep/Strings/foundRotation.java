package interview_prep.Strings;

//Check the rotation in given string 


public class foundRotation {
    public static boolean isStringRotated(String strA, String strB){
        return  (strA.length() == strB.length()) && ((strA+strA).indexOf(strB)  != -1);
    }

    public static void main(String[] args) {
        String strA = "ABCD";
        String strB = "CDAF";

        if(isStringRotated(strA, strB)){
            System.out.println("rotated ");
        }else{
            System.out.println("not rotated");
        }


    }
    
}