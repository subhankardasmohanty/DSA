package Arrays;

public class Q3979_Maximum_Valid_Pair_Sum {

    public int maxValidPairSum(int[] nums, int k) {

        int ans = -1;
        int maxLeft = nums[0];

        for (int j = k; j < nums.length; j++) {

            maxLeft = Math.max(maxLeft, nums[j - k]);
            ans = Math.max(ans, maxLeft + nums[j]);
        }

        return ans;

        // int n=nums.length;
        // int[] sf=new int[n+1];
        // for(int i=n-1;i>=0;i--)
        //     sf[i]=Math.max(nums[i],sf[i+1]); // maximum value from i to end
        // int ans=0;
        // for(int i=0;i+k<n;i++)
        //     ans=Math.max(ans,nums[i]+sf[i+k]); // best partner for index i
        // return ans;
    }
}
