# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
use a two-pointer approach j,k and check if the sum adds up to 0

# Approach
<!-- Describe your approach to solving the problem. -->
- sort the array 
- create a set to store the correct answers 
- iterate through the list, if the sum adds to 0 store it in the set s and increment j and k
- otherwise if sum > 0, decrement k. else increment j
- store the set inside a list and return the list
# Complexity
- Time complexity: O(n^2 logn)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(n)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution(object):
    def threeSum(self, nums):
        nums.sort()
        s = set()
        for i in range(len(nums)):
            j = i + 1
            k = len(nums)-1
            while j < k:
                sum = nums[i] + nums[j] + nums[k]
                if sum == 0:
                    s.add((nums[i], nums[j], nums[k]))
                    j += 1
                    k -= 1
                elif sum > 0:
                    k -= 1
                else:
                    j += 1
        res = list(s)
        return res
```