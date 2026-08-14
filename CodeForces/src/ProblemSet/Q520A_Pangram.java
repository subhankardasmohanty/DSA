package ProblemSet;

import java.util.*;

public class Q520A_Pangram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        boolean[] present = new boolean[26];

        for (char ch : s.toCharArray()) {
            ch = Character.toLowerCase(ch);
            present[ch - 'a'] = true;
        }

        for (boolean letter : present) {
            if (!letter) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
