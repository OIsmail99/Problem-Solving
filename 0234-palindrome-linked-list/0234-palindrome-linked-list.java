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

    public static ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode reversed = reverse(head);
        ListNode current = reversed;
        while(current != null){
            list.add(current.val);
            current = current.next;
        }
        //list now has the reversed linked list values
        ListNode original = reverse(reversed);
        current = original;
        int i = 0;
        while(current != null){
            if(current.val != list.get(i)){
                return false;
            }
                i++;
                current = current.next;
        }
        return true;
    }
}