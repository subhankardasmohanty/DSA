package ProblemSet;

import java.util.*;

public class Q1328A_Divisibility_Problem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long a = sc.nextLong();
            long b = sc.nextLong();

            long remainder = a % b;

            if (remainder == 0) {
                System.out.println(0);
            } else {
                System.out.println(b - remainder);
            }
        }

        sc.close();
    }
}
