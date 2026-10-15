package ProblemSet;

import java.util.*;

public class Q2913_Subarrays_Distinct_Element_Sum_of_Squares_I {

    public int sumCounts(List<Integer> nums) {

        int n = nums.size();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                set.add(nums.get(j));
                int count = set.size();
                sum += count * count;
            }
        }

        return sum;
    }
}
