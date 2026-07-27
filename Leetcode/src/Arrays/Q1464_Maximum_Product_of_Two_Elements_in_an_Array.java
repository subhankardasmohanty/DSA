package Arrays;

public class Q1464_Maximum_Product_of_Two_Elements_in_an_Array {

    public int maxProduct(int[] nums) {
        int max1 = 0, max2 = 0;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}
