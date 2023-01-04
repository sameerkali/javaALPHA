package interview_prep.Strings;

public class allPosiblePalindrome {

    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;

        while(i<=j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(ch1 == ch2) return true;
            else{
                return false;
            }
        }
        return true;

    }

    public static void solution (String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String ss = str.substring(i, j);
                // System.out.println(ss);
                if(isPalindrome(ss)) System.out.println(ss);
            }
        }
    }
    public static void main(String[] args) {
        String str = "abccsba";
        solution(str);
    }
}
