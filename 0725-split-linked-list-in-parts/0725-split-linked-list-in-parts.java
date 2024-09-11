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
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode[] res = new ListNode[k];
        ListNode curr = head;

        int size = 0;
        while(curr != null){
            size++;
            curr = curr.next;
        }

        int minSize = size/k;
        int leftOut = size%k;
        curr = head;

        for(int i = 0; i < k; i++){
            ListNode newPart = new ListNode(0);
            ListNode tail = newPart;

            
            int currSize = minSize;
            if(leftOut > 0){
                currSize++;
                leftOut--;
            }
            int count = 0;
            while(count < currSize){
                tail.next = new ListNode(curr.val);
                curr = curr.next;
                tail = tail.next;
                count++;
            }
            res[i] = newPart.next;
        }
        return res;
    }
}