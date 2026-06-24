package Arrays;

import java.util.List;
import java.util.ArrayList;

public class Q_442_Find_All_Duplicates_in_an_Array {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int[] arr = new int[100001];

        for(int i = 0; i < nums.length; i++){
            int c = nums[i];

            if(arr[c] == -1){
                ans.add(c);
                continue;
            }
            arr[c] = -1;
        }

        return ans;
    }
}
