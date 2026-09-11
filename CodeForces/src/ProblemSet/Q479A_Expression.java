package ProblemSet;

import java.util.*;


public class Q479A_Expression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x1 = a + b + c;
        int x2 = a * b * c;
        int x3 = (a + b) * c;
        int x4 = a * (b + c);
        int x5 = (a * b) + c;
        int x6 = a + (b * c);

        int ans = Math.max(x1,
                Math.max(x2,
                        Math.max(x3,
                                Math.max(x4,
                                        Math.max(x5, x6)))));

        System.out.println(ans);
    }
}
