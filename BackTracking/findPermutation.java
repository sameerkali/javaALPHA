package BackTracking;

// import String.string;

public class findPermutation {
    public static void find_Permutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //kaam
        for(int i = 0; i < str.length(); i++){                           //O(n * n!)
            char temp = str.charAt(i);
            //"abcde" => "ab" + "de" = "abde"
            String NewStr = str.substring(0, i) + str.substring(i+1);
            find_Permutation(NewStr, ans+temp);
        }
    }
 public static void main(String[] args) {
    String str = "ABC";
    find_Permutation(str, "");
 } 
}
