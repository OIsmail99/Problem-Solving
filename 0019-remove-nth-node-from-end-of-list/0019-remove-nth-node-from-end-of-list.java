/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
    //[1,2,3,4,5]
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode slow = dummy;
    ListNode fast = dummy;
    for(int i=0; i <= n; i++){ //fast should move n times
        fast = fast.next;
    }
    while(fast != null){
        fast = fast.next;
        slow = slow.next;
    }   //slow is now at the node right before the node to be removed
    //if the node to be removed is the head, slow is at the dummy node.
    slow.next = slow.next.next;
    return dummy.next; //returning the head.
}
}