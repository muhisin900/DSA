# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
use a hashamp and store the key,value of each string and check if they are equal
# Approach
<!-- Describe your approach to solving the problem. -->
- check the length of both strings, if they are != return false
- make a hashmap and iterate through one string storing the key, values of each character
- iterate through the next string and check if the char is not in the hashmap or its value = 0, return false
- otherwise decrement the count value of the current char
- lastly return true if the loop did not return false
# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // hashmap that counts the occurences of each char
        Map<Character, Integer> count = new HashMap<>();
        // iterate through each string
        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c,0) + 1);
        }
        
        for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            // check if the char is not in dictionary or its count == 0
            if (!count.containsKey(c) || count.get(c) == 0){
                return false;
            }
            // decrement the count
            count.put(c, count.get(c) - 1);
        }
        return true;
    }
}
```