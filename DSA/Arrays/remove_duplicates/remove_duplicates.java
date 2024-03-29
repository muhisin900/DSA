package DSA.Arrays.remove_duplicates;

import java.util.HashMap;
import java.util.Map;

public class remove_duplicates {
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
}
