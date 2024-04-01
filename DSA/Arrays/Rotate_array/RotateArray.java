package DSA.Arrays.Rotate_array;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    class Solution {
        public void rotate(int[] nums, int k) {
            // Using an array list
            // ArrayList<Integer> arr = new ArrayList<>(); 
            // for(int i = 0; i < nums.length; i++){
            //     arr.add(nums[i]);
            // }
            
            // for(int i = 0; i < nums.length; i++){
            //     nums[(i+k)%nums.length] = arr.get(i);
            // }
    
            k = k%nums.length;
            //reversing the entire array
            reverseArray(nums, 0, nums.length-1);
            // reversing left side until k
            reverseArray(nums, 0, k-1);
            // reversing the right side
            reverseArray(nums, k, nums.length-1);
    
    
        }
        public void reverseArray(int[] arr, int left, int right){
            while(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
