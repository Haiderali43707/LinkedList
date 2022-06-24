class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null|| head.next==null)
        {
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        int temp=odd.val;
        odd.val=even.val;
        even.val=temp;
        if(head.next!=null)
        {
            swapPairs(head.next.next);
        }
        return head;
        
    }
}
