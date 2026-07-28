package Strings;

public class Q4000_Largest_Integer_With_Given_Digit_Sum {

    public int largestInteger(int n, int s) {

        if (s == 0) {
            return 0;
        }

        if (s > 9 * n) {
            return -1;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int digit = Math.min(9, s);
            sb.append(digit);
            s -= digit;
        }

        return Integer.parseInt(sb.toString());
    }
}
