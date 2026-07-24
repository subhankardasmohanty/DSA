package ProblemSet;

import java.util.*;

public class Q271A_Beautiful_Year {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        while (true) {
            year++;

            String s = String.valueOf(year);

            HashSet<Character> set = new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }

            if (set.size() == 4) {
                System.out.println(year);
                break;
            }
        }
    }
}
