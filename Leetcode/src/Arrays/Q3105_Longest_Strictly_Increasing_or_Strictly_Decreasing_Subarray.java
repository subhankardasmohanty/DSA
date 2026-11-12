package Arrays;

public class Q3105_Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray {

    public int longestMonotonicSubarray(int[] nums) {

        int inc = 1;
        int dec = 1;
        int ans = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                inc++;
                dec = 1;
            }
            else if (nums[i] < nums[i - 1]) {
                dec++;
                inc = 1;
            }
            else {
                inc = 1;
                dec = 1;
            }

            ans = Math.max(ans, Math.max(inc, dec));
        }

        return ans;
    }
}
