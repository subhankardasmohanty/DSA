package Arrays;
import java .util.*;
public class Q2033_Minimum_Operations_to_Make_a_Uni_Value_Grid {

    public int minOperations(int[][] grid, int x) {

        int c = 0;
        int ans = 0;
        int[] arr = new int[grid.length * grid[0].length];

        int rem = grid[0][0] % x;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] % x != rem) {
                    return -1;
                }

                arr[c++] = grid[i][j];
            }
        }

        Arrays.sort(arr);

        int median = arr[c / 2];

        for (int n : arr) {
            ans += Math.abs(n - median) / x;
        }

        return ans;

    }
}
