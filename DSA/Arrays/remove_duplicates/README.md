# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
make a hashmap and store the unique values, and count how many unique values there are
# Approach
<!-- Describe your approach to solving the problem. -->
- make a hashmap, and a count variable
- iterate through nums, and check if the hashmap does not contain the current nums[i]
- if it doesn't, set nums[count] = nums[i] and increment count
- return count
# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(n)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> res = new HashMap<>();
        int count = 0;
        for (int i = 0; i<nums.length; i++){
            if (!res.containsKey(nums[i])){
                res.put(nums[i], nums[i]);
                nums[count] = nums[i];
                count++;
            }
        }return count;
    }
}
```