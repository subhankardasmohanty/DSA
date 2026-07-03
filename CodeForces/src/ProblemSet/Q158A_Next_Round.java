package ProblemSet;

import java.util.*;

public class Q158A_Next_Round {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = 0;

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){

            arr[i] = sc.nextInt();
        }

        int a = arr[k-1];

        for(int i = 0; i < arr.length; i++){

            if(arr[i] >= a && arr[i] > 0){
                c++;
            }
        }

        System.out.println(c);
    }
}
