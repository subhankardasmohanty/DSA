package Math;

public class Q3754_Concatenate_NonZero_Digits_and_Multiply_by_Sum_I {

    public long sumAndMultiply(int n) {

        long x = 0;
        long sum = 0;

        while(n > 0){
            int temp = n % 10;

            if(temp == 0){
                n /= 10;
                continue;
            }
            x = x*10 + temp;
            sum += temp;
            n /= 10;

        }

        long rev = 0;

        while (x > 0) {
            long digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

        return rev*sum;
    }
}
