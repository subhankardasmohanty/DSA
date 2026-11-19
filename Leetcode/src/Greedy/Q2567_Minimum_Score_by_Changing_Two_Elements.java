package Greedy;

import java.util.*;
public class Q2567_Minimum_Score_by_Changing_Two_Elements {

    public int minimizeSum(int[] nums) {

        int n = nums.length;

        Arrays.sort(nums);

        int case1 = nums[n - 1] - nums[2];
        int case2 = nums[n - 2] - nums[1];
        int case3 = nums[n - 3] - nums[0];

        return Math.min(case1, Math.min(case2, case3));

    }
}
