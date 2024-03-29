# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
look at the indexs of nums1 after m and change it all to nums2

# Approach
<!-- Describe your approach to solving the problem. -->
- iterate through the length of n
- set the indexs at nums1[m] = to nums2[i]
- increment m
- sort nums1

# Complexity
- Time complexity: O((m+n)log(m+n))
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++){
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }
}
```