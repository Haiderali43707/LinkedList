class Solution {
    public ListNode reverseKGroup(ListNode head, int k) 
        {
        if(head==null)
        {
            return null;
        }
        ListNode temp=head;
        ListNode t1=head;
        int cnt=0;
        while(t1!=null){
            cnt++;
            t1=t1.next;
        }
        if(cnt<k){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        int count=0;
        while(temp!=null && count<k)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            count++;
            
        }
        // System.out.println(count);
        head.next=reverseKGroup(curr,k);
        return prev;   //Your code here;
        
    }
}
