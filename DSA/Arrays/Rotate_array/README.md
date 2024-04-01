# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
reverse the array, 

# Approach
<!-- Describe your approach to solving the problem. -->
- set k = k % nums.length
- reverse the entire array
- reverse the left side of the array up until k
- reverse k till the end of the array

# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
import java.util.ArrayList;


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
```