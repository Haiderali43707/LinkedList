class Solution {
    public ListNode swapNodes(ListNode head, int k) {
       
        ListNode first=head;
        ListNode sec=head;
        ListNode slow=head;
        ListNode fast=head;
       for(int i=0;i<k-1;i++)
       {
           fast=fast.next;
           first=fast;
       }
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        sec=slow;
        int temp=first.val;
        first.val=sec.val;
        sec.val=temp;
        return head;
       
        
        
    }
}
