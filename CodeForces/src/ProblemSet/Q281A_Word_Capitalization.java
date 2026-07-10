package ProblemSet;

import java.util.Scanner;

public class Q281A_Word_Capitalization {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1));
    }
}
