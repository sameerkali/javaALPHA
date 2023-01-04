package String;

public class strCompression {
    public static String compress (String str) {
        StringBuilder newStr = new StringBuilder("");
        for (int i=0;i<str.length();i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count ++;
                i++;
            } newStr.append(str.charAt(i));
            if (count > 1) {
                newStr.append(count.toString());                                       //keyWord
            }
        }
        return newStr.toString();                                                      //keyWord
    }
    public static void main(String[] args) {
        String str = "aaaannnnrrrrrrrrirrrrrrrrrrrrrrrrrrppp";
        System.out.println(compress(str));
    }
}


// It is leneat time complexity because of i is length of string ab string ki length andar count ho yah dusre loop me bat toh ek hi hai 
//loop is == length of string (n operation)
//0(n)
//stringBuilder ki wajah se internal calculation fast ho gayi that reduce the time of our program