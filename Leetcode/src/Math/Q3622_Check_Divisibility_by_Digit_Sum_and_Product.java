package Math;

public class Q3622_Check_Divisibility_by_Digit_Sum_and_Product {

    public boolean checkDivisibility(int n) {

        int original = n;
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            n /= 10;

            sum += digit;
            product *= digit;
        }

        return original % (sum + product) == 0;
    }
}
