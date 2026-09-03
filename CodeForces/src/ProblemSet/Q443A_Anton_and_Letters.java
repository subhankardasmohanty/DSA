package ProblemSet;

import java.util.*;

public class Q443A_Anton_and_Letters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Set<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }

        System.out.println(set.size());

        sc.close();
    }
}
