import java.util.*;

public class trapWater {

    public static int storWater(ArrayList<Integer>height){
        int maxWater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = 0; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int wh = j-i;
                int currWater = ht * wh;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    public static int storageWater(ArrayList<Integer>height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int wh = rp-lp;
            int currWater2 = ht * wh;

            maxWater = Math.max(maxWater, currWater2);
        }

        if(height.get(lp) < height.get(rp)){
             lp++; 
          }else {
             rp--;
            }



        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter building number:");
        // int n = sc.nextInt();
        // for (int i = 0; i < n ; i++) {
        // System.out.print("Enter the height of building number:" + i + " :");
        // height.add(sc.nextInt());
        // }
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Trapped water is : "+storageWater(height));
    }
}
