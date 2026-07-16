package Twopointers;

public class Q75_Sort_Colors {

    public void sortColors(int[] nums) {
        int a=0;
        int b=0;
        int c=nums.length-1;
        while (b <= c) {
            if(nums[b]==0){
                int k=nums[a];
                nums[a]=nums[b];
                nums[b]=k;
                a++;
                b++;
            }
            else if(nums[b]==1){
                b++;
            }
            else{
                int k=nums[b];
                nums[b]=nums[c];
                nums[c]=k;
                c--;
            }
        }
    }
}
