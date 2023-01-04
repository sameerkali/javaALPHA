package BackTracking;
public class substring{

public static void findSubstring(String str, int i, String ans) {
    //base case
    if(i == str.length()){
        if(ans.length() == 0){
            System.out.print("Null");
        }else{
            System.out.print(ans);
        }
        return;
    }
    //yes
    findSubstring(str,i+1,ans+str.charAt(i));
    //no
    findSubstring(str,i+1,ans);
} 



    public static void main(String[] args) {
        String str = "abc";
        findSubstring(str,0,"");
        
    }
}
