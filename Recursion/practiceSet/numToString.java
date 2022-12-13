package Recursion.practiceSet;

public class numToString {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void numtostring (int numbers) {
        if (numbers == 0) return;
        int lastDigit = numbers %10;
        numtostring(numbers/10);
        System.out.print(digits[lastDigit] + " ");

    }
    public static void main(String[] args) {
        int num = 12345;
        numtostring(num);
    }
}
