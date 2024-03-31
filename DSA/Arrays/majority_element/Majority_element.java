package DSA.Arrays.majority_element;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majority_element {
    class Solution {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            int mid = nums.length / 2;
            int n = nums[mid];
            return n;
    
            // Map<Integer, Integer> res = new HashMap<>();
            // int n = nums.length / 2;
            // for (int i = 0; i < nums.length; i++){
            //     res.put(nums[i], res.getOrDefault(nums[i], 0) + 1);
            // }
    
            // for (Map.Entry<Integer, Integer> entry: res.entrySet()){
            //     if (entry.getValue() > n){
            //         return entry.getKey();
            //     }
            // }
            // return 0;
    
            // int count = 0;
            // int candidate = 0;
    
            // for (int i : nums){
            //     if (count == 0){
            //         candidate = i; // = 2, 1, 2, 
            //     }
            //     if (i == candidate){
            //         count++; // = 1, 0, 1, 0, 1
            //     }else{
            //         count--;
            //     }
            // }
            // return candidate;
        }
    }
}

