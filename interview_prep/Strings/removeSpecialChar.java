package interview_prep.Strings;


public class removeSpecialChar {
    public static void main(String[] args) {
        String check = "SameerFaridi!@#";
        int count = 0;
        String spChar = "";

        for (int i = 0; i < check.length(); i++) {
            if (!Character.isAlphabetic(check.charAt(i)) && !Character.isWhitespace(check.charAt(i))
                    && !Character.isDigit(check.charAt(i))) {
                        count++;
            }else{
                    spChar = spChar+check.charAt(i);
            }
        }
        if(count == 0){
            System.out.println("Dont have any special charactor");
        }else{
            System.out.println("Special charactor found : " + count);
            System.out.println("special charactor is removed : " + spChar);
        }

    }
}
