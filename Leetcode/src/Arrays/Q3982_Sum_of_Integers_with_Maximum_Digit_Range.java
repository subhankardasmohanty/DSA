package Arrays;

public class Q3982_Sum_of_Integers_with_Maximum_Digit_Range {

    public int maxDigitRange(int[] nums) {

        int range = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            int a = getRange(nums[i]);

            if(a > range){
                range = a;
            }
        }

        for(int i = 0; i < nums.length; i++){
            int a = getRange(nums[i]);

            if(a == range){
                sum += nums[i];
            }
        }

        return sum;


    }

    private int getRange(int num) {
        int max = 0;
        int min = 9;

        while (num > 0) {
            int digit = num % 10;
            max = Math.max(max, digit);
            min = Math.min(min, digit);
            num /= 10;
        }

        return max - min;
    }
}
