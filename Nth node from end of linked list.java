class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	Node s=head;
    	Node f=head;
    	if(n>ls.size())
    	{
    	    return -1;
    	}
    	if(ls.size()>n)
    	{
    	for(int i=0;i<n;i++)
    	{
    	    f=f.next;
    	}
    	}
    	while(f!=null)
    	{
    	    s=s.next;
    	    f=f.next;
    	}
    	return s.data;
    }
}
