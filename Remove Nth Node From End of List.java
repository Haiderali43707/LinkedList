class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create two nodes pointing to head;
        ListNode first = head;
        ListNode second = head;
        
        // make second node n nodes ahead of first node;
        for (int i =0; i <n; i++)
            second = second.next;
        
        if (second == null)
            return first.next;
        
     
        while(second.next != null) {
            first = first.next;
            second = second.next;
        }
       
        first.next = first.next.next;
        
        return head;
    }
}
