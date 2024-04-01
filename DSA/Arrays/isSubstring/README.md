# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
count how many letters of the string s appear in t

# Approach
<!-- Describe your approach to solving the problem. -->
- check if s is empty then it must be a substring of t, return true
- initialize count variable
- iterate through string t
- if s at index count = t at index i, increment count
- if count = length of s, then all of s is in t, return true
- return false if it doesn't return true
# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0){
            return true;
        }
        int count = 0;
        for (int i = 0; i < t.length(); i++){
            if (s.charAt(count) == t.charAt(i)){
                count++;
            }
            if (count == s.length()){
                return true;
            }
        }
        return false;

    }
}
```