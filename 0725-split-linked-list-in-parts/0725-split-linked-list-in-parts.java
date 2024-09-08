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
        int size = 0;
        ListNode curr = head;

        while(curr != null){
            size++;
            curr = curr.next;
        }
        int minSize = size/k;
        int remainingNodes = size%k;
        curr = head;

        for(int i = 0; i < k; i++){
            ListNode newPart = new ListNode(0);
            ListNode tail = newPart;

            int currSize = minSize;
            if(remainingNodes > 0){
                currSize++;
                remainingNodes--;
            }
            int j = 0;
            while(j < currSize){
                tail.next = new ListNode(curr.val);
                tail = tail.next;
                j++;
                curr = curr.next;
            }
            res[i] = newPart.next;
        }
        return res;
    }
}