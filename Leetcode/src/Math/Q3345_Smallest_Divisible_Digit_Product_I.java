package Math;

public class Q3345_Smallest_Divisible_Digit_Product_I {

    public int smallestNumber(int n, int t) {

        while (true) {
            int product = 1;
            int num = n;

            while (num > 0) {
                product *= (num % 10);
                num /= 10;
            }

            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }
}
