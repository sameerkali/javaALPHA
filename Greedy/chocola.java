package Greedy;

import java.util.*;

public class chocola {

  public static void main(String[] args) {
    //size of matrics
    // int n = 4, m = 6;
    Integer costVer[] = { 2, 1, 3, 1, 4 };
    Integer costHor[] = { 4, 1, 2 };

    //sort Desending order -- 4,3,2,1
    Arrays.sort(costVer, Collections.reverseOrder());
    Arrays.sort(costHor, Collections.reverseOrder());

    //that line we have to css next
    int h = 0, v = 0;
    //how many parts after making line in between matrics
    int hp = 1, vp = 1;
    //cost of operation
    int cost = 0;

    while(h < costHor.length && v < costVer.length){
        if(costVer[v] <= costHor[h]){ // horizontal cut
            cost += (costHor[h] * vp);
            hp++; h++;
        }else{
            cost += (costVer[v] * hp);
            vp++; v++;
        }
    }

    while(v < costHor.length){
        cost += (costHor[h] * vp);
            hp++; h++;
    }
    while(v < costVer.length){
        cost += (costVer[v] * vp);
            vp++; v++;
    }


    System.out.println("minimum cost of cuts : " + cost);
  }
}
