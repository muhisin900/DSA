# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->

# Approach
<!-- Describe your approach to solving the problem. -->
- make a count variable
- iterate through the nums array and check if the current value != val
- set nums[count] = nums[i] and increment count
- return count

# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i<nums.length; i++){
            if (nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }return count;
    }
}
```