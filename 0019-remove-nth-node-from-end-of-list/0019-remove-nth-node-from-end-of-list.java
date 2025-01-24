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
        int position = length - n; //position of the node before nth
        for(int i =1; i < position; i++){ //1,2,3
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }
}