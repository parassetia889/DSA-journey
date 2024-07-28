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
        
        if(head == null || head.next == null)
            return true;

        ListNode curr = head;
        Stack<ListNode> st = new Stack<>();

        while(curr != null){
            st.add(curr);
            curr = curr.next;
        }

        while(head != null){
            if(head.val != st.pop().val)
                return false;
            head = head.next;
        }

        return true;



    }
}