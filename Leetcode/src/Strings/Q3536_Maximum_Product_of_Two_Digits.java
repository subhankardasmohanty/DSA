package Strings;


// class Solution {
//     public int maxProduct(int n) {

//         int max = 0;

//         String str = String.valueOf(n);

//         for(int i = 0; i < str.length() - 1; i++){

//             for(int j = i+1; j < str.length(); j++){

//                 int d1 = str.charAt(i) - '0';
//                 int d2 = str.charAt(j) - '0';

//                 max = Math.max(max, d1 * d2);
//             }
//         }

//         return max;
//     }
// }


public class Q3536_Maximum_Product_of_Two_Digits {

    public int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }

            n /= 10;
        }

        return max1 * max2;
    }
}
