package interview_prep.Strings;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String input_1 = "listen", input_2 = "silentqw";
        char[] convertToCharArray_1 = input_1.toCharArray();
        char[] convertToCharArray_2 = input_2.toCharArray();

        Arrays.sort(convertToCharArray_1);
        Arrays.sort(convertToCharArray_2);

        boolean result = Arrays.equals(convertToCharArray_1, convertToCharArray_2);

        if(result) System.out.println("anagram");
        else System.out.println("not a anagram");


    }
}
