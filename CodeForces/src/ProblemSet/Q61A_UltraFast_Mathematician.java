package ProblemSet;

import java.util.*;

public class Q61A_UltraFast_Mathematician {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                ans.append('0');
            } else {
                ans.append('1');
            }
        }

        System.out.println(ans);
    }
}
