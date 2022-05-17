class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        
        // Add code here
        HashSet<Node>set=new HashSet<>();
        if(head==null)
        {
            return true;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            if(set.contains(temp))
            {
                return true;
            }
            else
            {
                set.add(temp);
                temp=temp.next;
            }
        }
        return false;
    }
}
