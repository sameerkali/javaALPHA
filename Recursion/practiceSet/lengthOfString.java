package Recursion.practiceSet;

public class lengthOfString {
    public static int lengthofstring(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return 1 + lengthofstring(str.substring(1));

    }
    public static void main(String[] args) {
        String find = "abcde";
        System.out.println(lengthofstring(find));

    }
}

/*Explainetion == ye jo +1 hai ye str.length ko zero(0) na hone ke lea hai bas agar zero ho gayaa toh pura return 0 ho jaiga return 0 na ho iss lea +1 lagaya hai */


//                   abcde
//step one --        abcd +1   =5
//step two --        abc  +1   =4
//step three --      ab   +1   =3
//step four --       a    +1   =2
//step five --       0    +1   =1
