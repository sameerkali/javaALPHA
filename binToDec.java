public class binToDec {


    public static void binToDecimal(int binNum){
        int pow = 0;
        int decNum = 0;
        int myNum = binNum;
        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.print("decimal of " + myNum+" = " + decNum);
    }



    public static void main (String[] args){
        binToDecimal(111);
    }


    
}
