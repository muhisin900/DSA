# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
iterate through the array to fix the minimum index, and use the max function to find the max current index - minimum
# Approach
<!-- Describe your approach to solving the problem. -->
- set the initial min to the first index
- initialize profit to 0
- iterate through the array and check if the min > the current index, update min
- calculate profit by use the max function with the current profit and subtracting the current index - min

# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++){
            if (min > prices[i]){
                min = prices[i];
            }
            profit = Math.max(profit, prices[i] - min);
        }
        
        return profit;
    }
}
```