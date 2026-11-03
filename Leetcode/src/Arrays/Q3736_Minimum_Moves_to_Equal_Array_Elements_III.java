package Arrays;

public class Q3736_Minimum_Moves_to_Equal_Array_Elements_III {

    public int minMoves(int[] nums) {

        int sum = 0;
        int count = 0;
        int large = 0;

        for(int n : nums){

            sum += n;
            large = Math.max(large, n);
            count++;
        }

        return large * count - sum ;
    }
}
