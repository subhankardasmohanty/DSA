package Arrays;

import java.util.*;

public class Q4117_Minimum_Range_After_Sum_Operations {

    public int minRange(int a, int b, int c) {

//        int[] nums = {a, b, c};
//
//        Arrays.sort(nums);
//
//        int x = nums[0];
//        int y = nums[1];
//        int z = nums[2];
//
//        return Math.min(z - x, y);

        int m = Math.max(a,b);
        int max = Math.max(m,c);

        int n = Math.min(a,b);
        int min = Math.min(n,c);

        int mid = (a + b + c) - (max + min);

        return Math.min(max - min, mid);
    }
}
