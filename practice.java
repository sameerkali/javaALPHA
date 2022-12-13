// import javax.xml.namespace.QName;

public class practice {
    // public static int avarage(int a, int b, int c){
    // int ans = (a+b+c)/3; Q - 1
    // System.out.print(ans);
    // return 0;
    // }

    // public static int chkOddEven(int number){
    // if(number % 2 == 0){
    // System.out.print("True");
    // }else{
    // System.out.print("False");
    // }

    // return 0;
    // }

    // public static boolean chkPalendrome(int number){

    // int palindrome = number;
    // int reverse = 0;
    // while(palindrome != 0){
    // int reminder = palindrome % 10;
    // reverse = reverse * 10 + reminder;
    // palindrome = palindrome / 10;
    // }
    // if(number == reverse){
    // return true;
    // }
    // return false;
    // }

    public static int addition (int number) {

        // int num = number;
        int addition = 0;
        while(number > 0 ){
            int lastDigit = number % 10;
            addition += lastDigit;
            number /= 10;
        }
        // System.out.print(addition);
        return addition;
    }

    public static void main(String[] args) {
        // avarage(10,20,30); Q - 1

        // chkOddEven(69); Q - 2

        // if(chkPalendrome(1212)){
        // System.out.print("Yes it is");
        // }else{ Q - 3
        // System.out.print("No it's not");
        // }
        System.out.print(addition(123456));
    }
}
