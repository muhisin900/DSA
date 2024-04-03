# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
check two indexs at a time and if the 2nd index is greater than the first one, update result to the difference of the 2 indexes.
# Approach
<!-- Describe your approach to solving the problem. -->
- make 2 indexs m, k starting at 0, 1 and set res to 0
- iterate while k < length of prices
- check if prices[k] > prices[m] and update res
- increment m and k
- return res
# Complexity
- Time complexity: O(N)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int maxProfit(int[] prices) {

        int m = 0;
        int k = 1;
        int res = 0;
        while(k < prices.length){
            if (prices[k] > prices[m]){
                res += prices[k] - prices[m];
            }
            m += 1;
            k += 1;
        }
        return res;
    }
}
```