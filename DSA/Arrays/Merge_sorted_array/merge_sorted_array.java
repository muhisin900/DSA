package DSA.Arrays.Merge_sorted_array;

import java.util.Arrays;

public class merge_sorted_array {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i = 0; i < n; i++){
                nums1[m] = nums2[i];
                m++;
            }
            Arrays.sort(nums1);
        }
    }
}
