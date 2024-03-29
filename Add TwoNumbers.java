class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
    int carry = 0;
    ListNode dummy = new ListNode(0);
   ListNode temp = dummy;
    while (l1 != null || l2 != null || carry == 1) {
        if (l1 != null) {
            carry += l1.val;
            l1 = l1.next;
        }
        if (l2 != null) {
            carry += l2.val;
            l2 = l2.next;
        }
        ListNode node = new ListNode(carry%10);
         carry /= 10;
        temp.next=node;
       
        temp= temp.next;
    }
    return dummy.next;

        
        
    }
}
