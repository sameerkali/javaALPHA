package interview_prep.Strings;

public class palindrome {
    public static void main(String[] args) {
        String first = "samas";
        String palindrome = "";

        for (int i = first.length()-1; i >= 0; i--) {
            palindrome = palindrome + first.charAt(i);
        }
        if(first.equals(palindrome)) System.out.println("palindrome");
        else System.out.println(" not palindrome");
    }
}
