package ProblemSet;

import java.util.*;

public class Q144A_Arrival_of_the_General {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxIndex = 0;
        int minIndex = 0;

        // First occurrence of maximum
        for (int i = 1; i < n; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
        }

        // Last occurrence of minimum
        for (int i = 0; i < n; i++) {
            if (a[i] <= a[minIndex]) {
                minIndex = i;
            }
        }

        int answer = maxIndex + (n - 1 - minIndex);

        // Maximum crosses the minimum
        if (maxIndex > minIndex) {
            answer--;
        }

        System.out.println(answer);
    }
}
