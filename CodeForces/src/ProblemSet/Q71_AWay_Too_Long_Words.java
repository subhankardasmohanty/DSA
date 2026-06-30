package ProblemSet;

import java.util.Scanner;

public class Q71_AWay_Too_Long_Words {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n > 0){

            String str = sc.next();

            if(str.length() > 10){
                System.out.println(str.charAt(0) + "" +(str.length() - 2) + str.charAt((str.length() - 1)));
            }
            else{
                System.out.println(str);
            }

            n--;
        }
    }
}
