package interview_prep.Strings;

public class dupli {
    public static void main(String[] args) {
        String given = "sameerfaridi";
        char[] ch = given.toCharArray();
        String collection = "";

        for (int i = 0; i < given.length(); i++) {
            for(int j = i+1; j<given.length();j++){
                if(ch[i] == ch[j]){
                    collection = collection + ch[j];
                    // break;
                }
            }
        }
                    System.out.println("The duplicates are : " + collection);

    }
}
