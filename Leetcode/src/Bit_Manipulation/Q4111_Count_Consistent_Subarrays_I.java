package Bit_Manipulation;

public class Q4111_Count_Consistent_Subarrays_I {

    public int countConsistent(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length; i++){

            int min = Integer.MAX_VALUE;
            int and = Integer.MAX_VALUE;

            for(int j = i; j < nums.length; j++){

                min = Math.min(min, nums[j]);
                and &= nums[j];

                if(min == and){
                    count++;
                }
            }
        }

        return count;
    }
}
