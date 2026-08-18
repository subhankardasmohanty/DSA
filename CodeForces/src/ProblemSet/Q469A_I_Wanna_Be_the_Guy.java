package ProblemSet;

import java.util.*;

public class Q469A_I_Wanna_Be_the_Guy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] passed = new boolean[n + 1];

        // Little X levels
        int p = sc.nextInt();

        for (int i = 0; i < p; i++) {
            int level = sc.nextInt();
            passed[level] = true;
        }

        // Little Y levels
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int level = sc.nextInt();
            passed[level] = true;
        }

        // Check all levels
        for (int i = 1; i <= n; i++) {
            if (!passed[i]) {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }

        System.out.println("I become the guy.");
    }
}
