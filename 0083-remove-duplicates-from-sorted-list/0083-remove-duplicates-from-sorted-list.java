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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.val == current.next.val){ //remove the next node
                ListNode temp = current.next;
                current.next = temp.next;
                temp.next = null;
            }
            else{
            current = current.next;
            }
        }
        return head;
    }
}