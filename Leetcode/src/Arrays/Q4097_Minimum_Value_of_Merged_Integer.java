package Arrays;

public class Q4097_Minimum_Value_of_Merged_Integer {

    public int minMergedInteger(int[] nums) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i += 2) {

            int a = Integer.parseInt("" + nums[i] + nums[i + 1]);

            min = Math.min(min, a);
        }

        return min;
    }
}
