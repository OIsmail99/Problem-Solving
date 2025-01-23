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
    public static int lengthOfList(ListNode head){
        ListNode current = head;
        int counter = 0;
        while(current != null){
            counter++;
            current = current.next;
        }
        return counter;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = lengthOfList(head);
        System.out.println(length);
        if(n == length){
            return head.next;
        }
        ListNode current = head;
        while(current != null){
            if(length == n + 1 && current.next != null){
                ListNode temp = current.next;
                current.next = temp.next;
                temp.next = null;
                return head;
            }
            current = current.next;
            length--;
        }
        return head;
    }
}