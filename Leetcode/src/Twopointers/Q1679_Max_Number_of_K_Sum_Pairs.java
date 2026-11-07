package Twopointers;
import java.util.*;

public class Q1679_Max_Number_of_K_Sum_Pairs {

    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);

        int c = 0;
        int a = 0;
        int b = nums.length - 1;

        while(a < b){

            int sum = nums[a] + nums[b];

            if(sum == k){
                c++;
                a++;
                b--;
            }

            else if(sum > k){
                b--;
            }

            else{

                a++;
            }
        }

        return c;
    }
}
