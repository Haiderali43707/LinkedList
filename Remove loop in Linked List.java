class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        HashSet<Node>set=new HashSet<>();
        Node temp=head;
        while(temp!=null)
        {
            set.add(temp);
            if(set.contains(temp.next))
            {
                temp.next=null;
                return;
            }
            temp=temp.next;
        }
    }
}
