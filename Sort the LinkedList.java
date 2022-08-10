class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null|| head.next==null)
        {
            return head;
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        ListNode curr=head;
        while(curr!=null)
        {
            pq.add(curr.val);
            curr=curr.next;
        }
        curr=head;
        while(curr!=null && !pq.isEmpty() )
        {
            curr.val=pq.poll();
            curr=curr.next;
        }
        return head;
        
        
        
        
    }
}
