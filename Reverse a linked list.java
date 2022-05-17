class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        if(head==null)
        {
            return null;
        }
       
        Node curr=head;
        Node prev=null;
        Node temp=head;
        while(temp!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
