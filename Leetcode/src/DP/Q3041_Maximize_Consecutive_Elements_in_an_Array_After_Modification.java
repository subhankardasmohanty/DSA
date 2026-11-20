package DP;

import java.util.*;
public class Q3041_Maximize_Consecutive_Elements_in_an_Array_After_Modification {

    public int maxSelectedElements(int[] nums) {

        Arrays.sort(nums);

        int m = nums[nums.length - 1];

        int[] dp = new int[m + 2];

        int ans = 0;

        for(int n : nums){

            dp[n + 1] = Math.max(dp[n + 1] , dp[n] + 1);
            dp[n] = Math.max(dp[n] , dp[n - 1] + 1);

            ans = Math.max(ans, Math.max(dp[n], dp[n + 1]));
        }

        return ans;
    }
}
