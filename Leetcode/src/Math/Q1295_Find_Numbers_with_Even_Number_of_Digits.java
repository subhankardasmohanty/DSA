package Math;

public class Q1295_Find_Numbers_with_Even_Number_of_Digits {

    public int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {
            int digits = (int) Math.log10(num) + 1;

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
