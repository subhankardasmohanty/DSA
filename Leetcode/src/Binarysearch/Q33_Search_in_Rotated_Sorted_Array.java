package Binarysearch;

public class Q33_Search_in_Rotated_Sorted_Array {

    public int search(int[] nums, int target) {

        int a = 0;
        int b = nums.length - 1;

        while (a <= b) {

            int mid = a + (b - a) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[a] <= nums[mid]) {

                if (target >= nums[a] && target < nums[mid]) {
                    b = mid - 1;
                }

                else {
                    a = mid + 1;
                }
            }
            else {

                if (target > nums[mid] && target <= nums[b]) {
                    a = mid + 1;
                }

                else {
                    b = mid - 1;
                }
            }
        }

        return -1;
    }
}
