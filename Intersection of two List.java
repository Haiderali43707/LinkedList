public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null && headB==null)
        {
            return null;
        }
        ListNode temp1=headA;
        int size1=0;
        while(temp1!=null)
        {
            
            temp1=temp1.next;
            size1++;
        }
        ListNode temp2=headB;
        int size2=0;
        while(temp2!=null)
        {
           
            temp2=temp2.next;
             size2++;
        }
        temp1=headA;
        temp2=headB;
        if(size1>size2)
        {
            for(int i=0;i<size1-size2;i++)
            {
                temp1=temp1.next;
            }
        }
            else if(size2>size1)
            {
               for(int i=0;i<size2-size1;i++)
                 {
                temp2=temp2.next;
                 } 
            }
        while(temp1!=temp2 &&temp2!=null) // yha hum koisa bhi bull check kr skte hai temp1 ya temp2
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp2;
        
        
        
        
        
        
    }
}
