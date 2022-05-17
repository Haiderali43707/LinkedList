class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here	
	if(x==1)
	{
	    return head.next;
	}
	int i=2;
	Node temp=head;
	while(i!=x)
	{
	    temp=temp.next;
	    i++;
	}
	temp.next=temp.next.next;
	return head;
    }
}
