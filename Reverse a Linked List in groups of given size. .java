class Solution
{
    public static Node reverse(Node head, int k)
    
    {
        if(head==null)
        {
            return null;
        }
        Node temp=head;
        Node prev=null;
        Node curr=head;
        int count=0;
        while(temp!=null && count<k)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            count++;
            
        }
        head.next=reverse(curr,k);
        return prev;   //Your code here
    }
}
