
public class rotation {
    public static String Lrotation(String str, int d){
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }
    public static String Rrotation(String str, int d){
        return Lrotation(str, str.length()-d);
    }
    public static void main(String[] args) {
        String str = "sameerfaridi";
        int d = 4;
        System.out.println(Lrotation(str, d));
    }
}