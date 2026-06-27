package Binarysearch;

public class Q852_Peak_Index_in_a_Mountain_Array {

    public int peakIndexInMountainArray(int[] arr) {

        int a = 0;
        int b = arr.length-1;

        while(a <= b){

            int mid = a + (b - a)/2;

            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid +1]){
                return mid;
            }

            if(arr[mid - 1] < arr[mid] && arr[mid + 1] > arr[mid]){
                a = mid;
            }

            if(arr[mid - 1] > arr[mid] && arr[mid + 1] < arr[mid]){
                b = mid;
            }

        }

        return 0;
    }
}
