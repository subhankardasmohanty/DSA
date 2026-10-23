package SlidingWindow;

public class Q209_Minimum_Size_Subarray_Sum {

    public int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int a = 0;

        for(int b = 0; b < nums.length; b++){

            sum += nums[b];

            while(sum >= target){

                min = Math.min(min, b - a + 1);
                sum -= nums[a];
                a++;

            }
        }

        return min == Integer.MAX_VALUE ? 0 : min ;
    }
}
