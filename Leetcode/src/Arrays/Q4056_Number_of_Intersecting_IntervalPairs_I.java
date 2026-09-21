package Arrays;

public class Q4056_Number_of_Intersecting_IntervalPairs_I {

    public int countIntersectingIntervals(int[][] intervals) {

        int ans = 0;

        for (int i = 0; i < intervals.length; i++) {

            for (int j = i + 1; j < intervals.length; j++) {

                int a = Math.max(intervals[i][0], intervals[j][0]);
                int b = Math.min(intervals[i][1], intervals[j][1]);

                if (a <= b) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
