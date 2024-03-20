package DSA.binary_search.binary_search;

public class binary_search {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low < high){
            mid = (high + low) / 2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        if (nums[low] == target){
            return low;
        }
        return -1;
    }
}