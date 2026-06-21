package Greedy;

import java.util.*; // for Arrays.sort()

public class Q_1833_Maximum_Ice_Cream_Bars {

    // Approach 1: Greedy + Sorting
    public int maxIceCreamSorting(int[] costs, int coins) {

        Arrays.sort(costs);

        int count = 0;

        for (int cost : costs) {
            if (cost > coins) {
                break;
            }

            count++;
            coins -= cost;
        }

        return count;
    }

    // Approach 2: Counting Sort Optimization
    public int maxIceCreamCountingSort(int[] costs, int coins) {

        int[] freq = new int[100001];

        for (int cost : costs) {
            freq[cost]++;
        }

        int count = 0;

        for (int cost = 1; cost <= 100000; cost++) {

            if (freq[cost] == 0) {
                continue;
            }

            int canBuy = Math.min(freq[cost], coins / cost);

            count += canBuy;
            coins -= canBuy * cost;

            if (coins < cost) {
                break;
            }
        }

        return count;

    }
}
