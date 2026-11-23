package Arrays;

public class Q4120_Count_Dominant_Elements {

    public int countDominantElements(int[] nums) {

        int c = 0;
        int n = nums.length;

        if(n == 1){
            return 1;
        }

        if(nums[0] >= nums[1]){
            c++;
        }
        if(nums[n - 1] >= nums[n - 2]){
            c++;
        }

        for(int i = 1; i < nums.length - 1; i++){

            if(2 * nums[i] >= nums[i - 1] + nums[i + 1]){
                c++;
            }
        }

        return c;
    }
}
