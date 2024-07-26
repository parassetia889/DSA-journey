class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode slow = head, fast = head;

        while(n > 0){
            n--;
            fast = fast.next;   
        }

        if(fast == null){
           ListNode temp = slow;
            temp  = temp.next;
            return temp;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}