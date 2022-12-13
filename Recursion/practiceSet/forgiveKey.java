package Recursion.practiceSet;

public class forgiveKey {
    public static void occourence(int num[], int key, int i)   {

            if(i == num.length) {
                return;
            }    
             if (num[i] == key) {
                System.out.print(i + " ");
             }
             occourence(num, key, i+1);


    }

    public static void main (String[] args) {
        int num[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        occourence(num, key, 0);
    }
}