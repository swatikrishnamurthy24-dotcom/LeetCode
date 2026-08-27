/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
       

        // Base case
        if (head == null)
            return null;

        // Recursively process the remaining list
        head.next = removeElements(head.next, val);

        // If current node has the value to remove
        if (head.val == val)
            return head.next;

        return head;
    }
}
        
    
