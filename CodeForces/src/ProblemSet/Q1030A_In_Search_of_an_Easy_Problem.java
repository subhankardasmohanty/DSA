package ProblemSet;

import java.util.*;

public class Q1030A_In_Search_of_an_Easy_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                System.out.println("HARD");
                return;
            }
        }

        System.out.println("EASY");
    }
}
