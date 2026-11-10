package Recursion;

public class Q50_Pow_x_n {

    public double myPow(double x, int n) {

        // long b = n;

        // if (b < 0) {
        //     x = 1 / x;
        //     b = -b;
        // }

        // return pow(x, b); floating point error in some cases

        long b = n;
        boolean negative = b < 0;

        if (negative) {
            b = -b;
        }

        double ans = pow(x, b);

        if (negative) {
            return 1.0 / ans;
        }

        return ans;
    }

    public double pow(double a, long b) {

        if (b == 0) {
            return 1;
        }

        double half = pow(a, b / 2);

        if (b % 2 == 0) {
            return half * half;
        }

        return half * half * a;
    }
}
