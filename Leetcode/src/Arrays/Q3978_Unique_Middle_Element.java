package Arrays;

public class Q3978_Unique_Middle_Element {

    public boolean isMiddleElementUnique(int[] nums) {

        int n = nums[(nums.length - 1) / 2];

        int c = 0;

        for(int a : nums){
            if(a == n){
                c++;
            }
        }
        return c == 1;
    }
}
