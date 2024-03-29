package DSA.Arrays.Remove_element;

public class remove_element {
    class Solution {
        public int remove_element(int[] nums, int val) {
            int count = 0;
            for (int i = 0; i<nums.length; i++){
                if (nums[i] != val){
                    nums[count] = nums[i];
                    count++;
                }
            }return count;
        }
    }
}
