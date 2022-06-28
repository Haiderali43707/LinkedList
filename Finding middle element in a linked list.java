class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         if(head==null)
         {
             return -1;
         }
       
         Node s=head;
         Node f=head;
         while(f!=null &&f.next!=null)
         {
               f=f.next.next;
             s=s.next;
            
         }
         return s.data;
    }
}
