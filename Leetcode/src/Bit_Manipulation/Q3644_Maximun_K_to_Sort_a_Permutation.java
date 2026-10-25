package Bit_Manipulation;

public class Q3644_Maximun_K_to_Sort_a_Permutation {

    public int sortPermutation(int[] nums) {

        int a = -1;
        int n = nums.length;

        for(int i = 0; i < n; i++){

            if(nums[i] != i){
                if(a == -1){
                    a = nums[i];
                }
                else{
                    a = a & nums[i];
                }
            }
        }

        return a == -1 ? 0 : a;
    }
}
