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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head, fast = head;
        
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //reversing the second half
        ListNode curr = slow;
        ListNode prev = null;
        ListNode forward = null;
        
        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        
        slow = prev;
        while(slow != null){
            if(slow.val != head.val)
                return false;
            slow = slow.next;
            head = head.next;
        }
        
        return true;
    }
}