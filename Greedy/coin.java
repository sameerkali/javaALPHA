package Greedy;

import java.util.*;

public class coin {

  public static void main(String[] args) {
    Integer[] coins = { 1, 2, 5, 10, 20, 50, 100, 200, 500 };
    Arrays.sort(coins, Comparator.reverseOrder());

    int amount = 2002;
    int countOfCoins = 0;
    ArrayList coinsUsed = new ArrayList<>();

    for (int i = 0; i < coins.length; i++) {
      if (coins[i] <= amount) {
        while (coins[i] <= amount) {
          countOfCoins++;
          coinsUsed.add(coins[i]);
          amount -= coins[i];
        }
      }
    }
    System.out.println("Total minimum coins is used un this transaction : " + countOfCoins);
    for (int i = 0; i < coinsUsed.size(); i++) {
        System.out.print(coinsUsed.get(i) + " ");
    }
    System.out.println();
  }
}

