class GfG
{
    public static int nknode(Node head, int k)
    {
        Node temp=head;
        int N=0;
        while(temp.next!=null)
        {
            N++;
            temp=temp.next;
            
        }
        
        temp=head;
        int n=(int)Math.ceil(N/k);
        while(n>0)
        {
            n--;
            temp=temp.next;
        }
        
        return temp.data;
       // add your code here
    }
}
