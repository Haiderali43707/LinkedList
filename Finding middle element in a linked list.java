class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         if(head==null)
         {
             return -1;
         }
         if(head.next==null)
         {
             return head.data;
         }
         Node s=head;
         Node f=head;
         while(f!=null &&f.next!=null)
         {
             s=s.next;
             f=f.next.next;
         }
         return s.data;
    }
}
