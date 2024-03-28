package DSA.Arrays.Valid_Anagram;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {
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
}
