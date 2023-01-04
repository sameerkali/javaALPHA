package interview_prep.Strings;

public class palindrom {

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;

        while(i<=j){
            int a = str.charAt(i);
            int b = str.charAt(j);

            if(a != b) return false;
            else {
                i++;
                j--;
            }
        } 
        return true;
    }
    public static void main(String[] args) {
        String str = "sameereemas";
        System.out.println(isPalindrome(str));
    }
}
