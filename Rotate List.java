class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) {
        return head;
    }
    ListNode p = head;
    int len = 1;
    while(p.next != null) {
        p = p.next;
        len++;
    }
    p.next = head;
    k=k%len;// no.of rotations
        int skip=len-k;
    for(int i = 0; i <skip; i++) {
        p = p.next;
    }
    head = p.next;
    p.next = null;
    return head;
    }
}
