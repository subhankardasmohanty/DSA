package ProblemSet;

import java.util.*;

public class Q110A_Nearly_Lucky_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int count = 0;

        for (char ch : n.toCharArray()) {
            if (ch == '4' || ch == '7') {
                count++;
            }
        }

        String luckyCount = String.valueOf(count);
        boolean isLucky = true;

        for (char ch : luckyCount.toCharArray()) {
            if (ch != '4' && ch != '7') {
                isLucky = false;
                break;
            }
        }

        if (count > 0 && isLucky) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
