# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
use a 2 pointer approach with a fast and slow pointer and check if the fast index = slow index, that means the list cycled
# Approach
<!-- Describe your approach to solving the problem. -->
- make a slow and fast list node and set it = head
- iterate while fast and fast.next != null
    - update fast and slow
    - check if fast = slow, meaning it cycled, return true
    - return false otherwise
# Complexity
- Time complexity: O(N)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity: O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }
}
```