package Binarysearch;

public class Q34_Finf_First_and_Last_Position_of_Element_in_Sorted_Array {

    public int[] searchRange(int[] nums, int target) {

        int[] result = {-1, -1};

        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);

        result[0] = left;
        result[1] = right;

        return result;
    }

    private int binarySearch(int[] nums, int target, boolean isSearchingLeft) {

        int left = 0;
        int right = nums.length - 1;
        int idx = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            }

            else if (nums[mid] < target) {
                left = mid + 1;
            }

            else {
                idx = mid;
                if (isSearchingLeft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return idx;
    }
}
