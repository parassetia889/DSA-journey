
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ArrayList<Integer> al = new ArrayList<>();
        
        while(head != null ){
            al.add(head.val);
            head = head.next;
        }
        Collections.sort(al);
        
        ListNode node = new ListNode(al.get(0),null);
        head = node;
        int  size = al.size();
       for(int i = 1; i<size; i++){
           ListNode temp = new ListNode(al.get(i));
           
            node.next = temp;
           node = temp;
        }
           node.next = null;
           return head;
    }
}