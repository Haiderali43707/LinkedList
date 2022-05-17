class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head==null)
        {
            return true;
        }
        if(head.next==null)
        {
            return true;
        }
        ArrayList<Integer>list=new ArrayList<>();
        Node temp=head;
        while(temp!=null)
        {
            list.add(temp.data);
            temp=temp.next;
        }
        int j=list.size()-1;
        int i=0;
        while(i<=j)
        {
            if(list.get(i)!=list.get(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }    
}
