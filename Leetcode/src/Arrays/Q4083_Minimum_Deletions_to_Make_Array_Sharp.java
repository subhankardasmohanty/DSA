package Arrays;

public class Q4083_Minimum_Deletions_to_Make_Array_Sharp {

    public int minDeletions(int[] nums) {

        int count = 0;

        for(int i = 1; i < nums.length; i++){

            if(nums[i] == nums[i - 1]){
                count ++;
            }
        }

        return count;
    }
}
