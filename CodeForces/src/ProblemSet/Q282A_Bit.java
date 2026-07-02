package ProblemSet;

import java.util.Scanner;

public class Q282A_Bit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int n = sc.nextInt();

        while(n-- > 0){

            String str = sc.next();

            if (str.equals("X++") || str.equals("++X")) {
                a++;
            } else {
                a--;
            }
        }

        System.out.println(a);
    }
}
