package DP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author rC
 */
public class Coins {

    /**
     * Given a list of N coins, their values (V1, V2, ... , VN),
     * and the total sum S. Find the minimum number of coins the sum
     * of which is S (we can use as many coins of one type as we want),
     * or report that it's not possible to select coins in such a way that
     * they sum up to S.
     * @param s
     * @param coins
     * @return
     */
    public int minCoins(int s, int[] coins) {
        int res = 0;
        int min[] = new int[s + 1];
        Arrays.fill(min, Integer.MAX_VALUE);
        Arrays.sort(coins);
        for (int i = 0; i < coins[0]; i++) {
            min[i] = 0;
        }
        for (int i = 0; i < coins.length; i++) {
            min[coins[i]] = 1;
        }
        for (int i = coins[0]; i <= s; i++) {
            System.err.print("i=" + i + " : ");
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i && i - coins[j] >= coins[0] &&
                        min[i - coins[j]] + 1 < min[i]) {
                    min[i] = min[i - coins[j]] + 1;
                    System.err.print(min[i] + "(" + coins[j] + ") ");
                }
            }
            System.err.println("");
        }
        print("", min);
        return min[s];
    }

    public int minCoins2(int s, int[] coins) {
        int res = 0;
        int min[] = new int[s + 1];
        Arrays.fill(min, Integer.MAX_VALUE);
        min[0] = 0;
        for (int j = 0; j < coins.length; j++) {
            System.err.print(coins[j] + " : ");
            for (int i = 0; i <= s; i++) {
                if (i + coins[j] <= s && min[i] + 1 < min[i + coins[j]]) {
                    System.err.print(i + "=");
//                    System.err.print(i + coins[j]+":"+min[i + coins[j]]+" ");
                    min[i + coins[j]] = min[i] + 1;
                    System.err.print(i + coins[j] + ":" + (min[i] + 1) + " ");
                }
            }
            System.err.println("");
        }
        print("", min);
        return min[s];
    }

    public static void main(String[] args) {
        System.err.println(new Coins().minCoins(112, new int[]{1, 3, 5}));
        System.err.println(new Coins().minCoins2(112, new int[]{1, 3, 5}));
//        System.out.println(new Trainning().minCoinsRC(11, new int[]{1, 3, 5}));
    }

    private static void print(String msg, Object... rs) {
        String x = Arrays.deepToString(rs);
        if (x.indexOf("[[") == 0) {
            x = x.substring(1, x.length() - 1);
        }
        System.err.println(msg + " " + x);
    }
}
