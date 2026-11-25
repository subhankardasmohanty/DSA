package submit;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 9;

        rec(9);
    }

    static void rec (int n){

        if(n == 0){
            return;
        }
        System.out.println(n);

        rec(n - 1);
    }
}
