package interview_prep.Strings;

public class rmvCHARfromFIRSTstringWHICHarePRESENTinSECOUNDstring {
    public static void main(String[] args) {
        String str1 = "thisistest";
        String str2 = "se";
        String finalStr = "";

        char[] str1_cahrArray = str1.toCharArray();
        char[] str2_cahrArray = str2.toCharArray();
        char[] finalStr_cahrArray = finalStr.toCharArray();
        System.out.println(str1_cahrArray);

        for(int i=0; i<str1_cahrArray.length; i++){
            // finalStr_cahrArray = str1_cahrArray.removeWord(str2_cahrArray[i]);
        }
    }
}
