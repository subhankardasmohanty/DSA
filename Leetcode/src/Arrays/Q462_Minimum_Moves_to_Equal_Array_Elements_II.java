package Arrays;
import java.util.Arrays;

public class Q462_Minimum_Moves_to_Equal_Array_Elements_II {

    public int minMoves2(int[] nums) {

        Arrays.sort(nums);

        int n = nums[(nums.length)/2];
        int sum = 0;

        for( int num : nums){

            sum += Math.abs(num - n);
        }

        return sum;
    }
}
